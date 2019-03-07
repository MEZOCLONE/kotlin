// IGNORE_BACKEND: JVM_IR

fun constant(): String {
    return """
        |Hello,
        |World
    """.trimMargin()
}

fun constantCustomPrefix(): String {
    return """
        ###Hello,
        ###World
    """.trimMargin(marginPrefix = "###")
}

// 2 LDC "Hello,\\nWorld"
// 0 LDC "###"
// 0 INVOKESTATIC kotlin/text/StringsKt.trimMargin
