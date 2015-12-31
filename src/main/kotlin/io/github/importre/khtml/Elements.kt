package io.github.importre.khtml

abstract class Element {

    var tidy: Boolean = false
        set(value) {
            field = value
            indent = if (value) indent else ""
        }

    var indent: String = "  "

    abstract fun render(builder: StringBuilder, tidy: Boolean, indent: String)

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, tidy, if (tidy) indent else "")
        return builder.toString().trimIndent()
    }
}

class TextElement(val text: String) : Element() {

    override fun render(builder: StringBuilder, tidy: Boolean, indent: String) {
        val s = if (tidy) Pair(indent, "\n") else Pair("", "")
        builder.append("${s.first}$text${s.second}")
    }
}
