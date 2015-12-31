package io.github.importre.khtml

import org.junit.Test
import kotlin.test.assertEquals

class KhtmlTest {

    @Test
    fun testKhtml() {
        val khtml = html {
            body {
                +"init"
            }
        }

        assertEquals("<html><body>init</body></html>", khtml.toString())
    }

    @Test
    fun testA() {
        val url = "https://github.com"
        val el = a {
            href = url
            +"github"
        }
        
        assertEquals("""<a href="$url">github</a>""", el.toString())
    }

    @Test
    fun testImg() {
        val el = img {
            src = "1.png"
        }

        assertEquals("""<img src="1.png"></img>""", el.toString())
    }
}