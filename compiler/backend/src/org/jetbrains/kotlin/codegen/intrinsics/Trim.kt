/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.intrinsics

import org.jetbrains.kotlin.codegen.Callable
import org.jetbrains.kotlin.codegen.CallableMethod
import org.jetbrains.kotlin.codegen.ExpressionCodegen
import org.jetbrains.kotlin.codegen.StackValue
import org.jetbrains.kotlin.psi.KtEscapeStringTemplateEntry
import org.jetbrains.kotlin.psi.KtLiteralStringTemplateEntry
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.resolve.calls.callUtil.getReceiverExpression
import org.jetbrains.kotlin.resolve.calls.model.DefaultValueArgument
import org.jetbrains.kotlin.resolve.calls.model.ExpressionValueArgument
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall
import org.jetbrains.org.objectweb.asm.Type

class TrimMargin : IntrinsicMethod() {
    override fun toCallable(method: CallableMethod, isSuper: Boolean, resolvedCall: ResolvedCall<*>): Callable {
        val receiverExpression = resolvedCall.getReceiverExpression()
        if (receiverExpression !is KtStringTemplateExpression || receiverExpression.hasInterpolation()) {
            return method
        }

        val literalText = receiverExpression.literalText
        val text = when (val argument = resolvedCall.valueArguments.values.single()) {
            is DefaultValueArgument -> literalText.trimMargin()
            is ExpressionValueArgument -> {
                val valueExpression = argument.valueArgument?.getArgumentExpression()
                if (valueExpression !is KtStringTemplateExpression || valueExpression.hasInterpolation()) {
                    return method
                }
                literalText.trimMargin(valueExpression.literalText)
            }
            else -> error("Unknown value argument type ${argument::class}: $argument")
        }

        return StringConstant(text)
    }
}

class TrimIndent : IntrinsicMethod() {
    override fun toCallable(method: CallableMethod, isSuper: Boolean, resolvedCall: ResolvedCall<*>): Callable {
        val receiverExpression = resolvedCall.getReceiverExpression()
        if (receiverExpression !is KtStringTemplateExpression || receiverExpression.hasInterpolation()) {
            return method
        }

        val text = receiverExpression.literalText.trimIndent()
        return StringConstant(text)
    }
}

private val TYPE_STRING = Type.getType(String::class.java)
private class StringConstant(private val text: String) : IntrinsicCallable(TYPE_STRING, emptyList(), null, null), IntrinsicWithSpecialReceiver {
    override fun invokeMethodWithArguments(resolvedCall: ResolvedCall<*>, receiver: StackValue, codegen: ExpressionCodegen) =
        StackValue.constant(text, TYPE_STRING)
}

private val KtStringTemplateExpression.literalText: String
    get() = buildString {
        children.forEach {
            append(
                when (it) {
                    is KtEscapeStringTemplateEntry -> it.unescapedValue
                    is KtLiteralStringTemplateEntry -> it.text
                    else -> throw IllegalStateException("Literal can only be computed on strings without interpolation")
                }
            )
        }
    }
