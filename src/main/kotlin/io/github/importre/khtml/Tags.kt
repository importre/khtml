package io.github.importre.khtml

abstract class Tag(val name: String) : Element() {
    
    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    var id: String
        get() = attributes["id"] ?: ""
        set(value) {
            attributes["id"] = value
        }

    var className: String
        get() = attributes["class"] ?: ""
        set(value) {
            attributes["class"] = value
        }

    protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, tidy: Boolean, indent: String) {
        val s = if (tidy) Pair(indent, "\n") else Pair("", "")
        builder.append("${s.first}<$name${renderAttributes()}>${s.second}")
        for (c in children) {
            c.render(builder, tidy, s.first + this.indent)
        }
        builder.append("${s.first}</$name>${s.second}")
    }

    private fun renderAttributes(): String? {
        val builder = StringBuilder()
        for (key in attributes.keys) {
            builder.append(""" $key="${attributes[key]}"""")
        }
        return builder.toString()
    }
}

abstract class TextTag(name: String) : Tag(name) {

    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}
