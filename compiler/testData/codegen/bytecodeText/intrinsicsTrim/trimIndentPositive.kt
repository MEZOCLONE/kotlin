// IGNORE_BACKEND: JVM_IR

fun constant(): String {
    return """
        Hello,
        World
    """.trimIndent()
}

// 1 LDC "Hello,\\nWorld"
// 0 INVOKESTATIC kotlin/text/StringsKt.trimIndent
