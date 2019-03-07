// IGNORE_BACKEND: JVM_IR

fun notConstant(arg: String): String {
    return arg.trimIndent()
}

fun interpolated(arg: Int):String {
    return """
        Hello,
        $arg
    """.trimIndent()
}

// TODO this could work if we could resolve references in the intrinsic.
private const val HAS_INDENT = """Hello,
        World"""
fun interpolatedUsingConstant(): String {
    return """
        Hello,
        $HAS_INDENT
        World
    """.trimIndent()
}

fun notInvoked():String {
    return """
        Hello,
        World
    """
}

// 1 LDC "\\n        Hello,\\n        World\\n    "
// 1 LDC "\\n        Hello,\\n        Hello,\\n        World\\n        World\\n    "
// 3 INVOKESTATIC kotlin/text/StringsKt.trimIndent
