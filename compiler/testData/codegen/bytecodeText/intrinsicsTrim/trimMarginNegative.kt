// IGNORE_BACKEND: JVM_IR

fun notConstant(arg: String): String {
    return arg.trimMargin()
}

fun notConstantCustomPrefix(arg: String): String {
    return arg.trimMargin("###")
}

fun interpolated(arg: Int):String {
    return """
        |Hello,
        |$arg
    """.trimMargin()
}

// TODO this could work if we could resolve references in the intrinsic.
private const val HAS_MARGIN = """Hello,
        |World"""
fun interpolatedUsingConstant(): String {
    return """
        |Hello,
        |$HAS_MARGIN
        |World
    """.trimMargin()
}

fun notInvoked():String {
    return """
        |Hello,
        |World
    """
}

fun constantNonConstantCustomPrefix(arg: String): String {
    return """
        |Hello,
        |World
    """.trimMargin(arg)
}

// 1 LDC "\\n        \|Hello,\\n        \|"
// 1 LDC "\\n    "
// 1 LDC "\\n        \|Hello,\\n        \|Hello,\\n        \|World\\n        \|World\\n    "
// 2 LDC "\\n        \|Hello,\\n        \|World\\n    "
// 5 INVOKESTATIC kotlin/text/StringsKt.trimMargin
