// Generated by Generator.kts
// DO NOT MODIFY

package io.github.importre.khtml

class HTML() : TextTag("html") {
    fun body(init: BODY.() -> Unit) = initTag(BODY(), init)
    fun head(init: HEAD.() -> Unit) = initTag(HEAD(), init)
}

abstract class HeadTag(name: String) : TextTag(name) {
    fun base(init: BASE.() -> Unit) = initTag(BASE(), init)
    fun link(init: LINK.() -> Unit) = initTag(LINK(), init)
    fun meta(init: META.() -> Unit) = initTag(META(), init)
    fun noscript(init: NOSCRIPT.() -> Unit) = initTag(NOSCRIPT(), init)
    fun script(init: SCRIPT.() -> Unit) = initTag(SCRIPT(), init)
    fun style(init: STYLE.() -> Unit) = initTag(STYLE(), init)
    fun title(init: TITLE.() -> Unit) = initTag(TITLE(), init)
}

abstract class BodyTag(name: String) : TextTag(name) {
    fun script(init: SCRIPT.() -> Unit) = initTag(SCRIPT(), init)
    fun a(init: A.() -> Unit) = initTag(A(), init)
    fun abbr(init: ABBR.() -> Unit) = initTag(ABBR(), init)
    fun address(init: ADDRESS.() -> Unit) = initTag(ADDRESS(), init)
    fun area(init: AREA.() -> Unit) = initTag(AREA(), init)
    fun article(init: ARTICLE.() -> Unit) = initTag(ARTICLE(), init)
    fun aside(init: ASIDE.() -> Unit) = initTag(ASIDE(), init)
    fun audio(init: AUDIO.() -> Unit) = initTag(AUDIO(), init)
    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun bdi(init: BDI.() -> Unit) = initTag(BDI(), init)
    fun bdo(init: BDO.() -> Unit) = initTag(BDO(), init)
    fun big(init: BIG.() -> Unit) = initTag(BIG(), init)
    fun blockquote(init: BLOCKQUOTE.() -> Unit) = initTag(BLOCKQUOTE(), init)
    fun br(init: BR.() -> Unit) = initTag(BR(), init)
    fun button(init: BUTTON.() -> Unit) = initTag(BUTTON(), init)
    fun canvas(init: CANVAS.() -> Unit) = initTag(CANVAS(), init)
    fun caption(init: CAPTION.() -> Unit) = initTag(CAPTION(), init)
    fun cite(init: CITE.() -> Unit) = initTag(CITE(), init)
    fun code(init: CODE.() -> Unit) = initTag(CODE(), init)
    fun col(init: COL.() -> Unit) = initTag(COL(), init)
    fun colgroup(init: COLGROUP.() -> Unit) = initTag(COLGROUP(), init)
    fun data(init: DATA.() -> Unit) = initTag(DATA(), init)
    fun datalist(init: DATALIST.() -> Unit) = initTag(DATALIST(), init)
    fun dd(init: DD.() -> Unit) = initTag(DD(), init)
    fun del(init: DEL.() -> Unit) = initTag(DEL(), init)
    fun details(init: DETAILS.() -> Unit) = initTag(DETAILS(), init)
    fun dfn(init: DFN.() -> Unit) = initTag(DFN(), init)
    fun dialog(init: DIALOG.() -> Unit) = initTag(DIALOG(), init)
    fun div(init: DIV.() -> Unit) = initTag(DIV(), init)
    fun dl(init: DL.() -> Unit) = initTag(DL(), init)
    fun dt(init: DT.() -> Unit) = initTag(DT(), init)
    fun em(init: EM.() -> Unit) = initTag(EM(), init)
    fun embed(init: EMBED.() -> Unit) = initTag(EMBED(), init)
    fun fieldset(init: FIELDSET.() -> Unit) = initTag(FIELDSET(), init)
    fun figcaption(init: FIGCAPTION.() -> Unit) = initTag(FIGCAPTION(), init)
    fun figure(init: FIGURE.() -> Unit) = initTag(FIGURE(), init)
    fun footer(init: FOOTER.() -> Unit) = initTag(FOOTER(), init)
    fun form(init: FORM.() -> Unit) = initTag(FORM(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)
    fun h2(init: H2.() -> Unit) = initTag(H2(), init)
    fun h3(init: H3.() -> Unit) = initTag(H3(), init)
    fun h4(init: H4.() -> Unit) = initTag(H4(), init)
    fun h5(init: H5.() -> Unit) = initTag(H5(), init)
    fun h6(init: H6.() -> Unit) = initTag(H6(), init)
    fun header(init: HEADER.() -> Unit) = initTag(HEADER(), init)
    fun hgroup(init: HGROUP.() -> Unit) = initTag(HGROUP(), init)
    fun hr(init: HR.() -> Unit) = initTag(HR(), init)
    fun i(init: I.() -> Unit) = initTag(I(), init)
    fun iframe(init: IFRAME.() -> Unit) = initTag(IFRAME(), init)
    fun img(init: IMG.() -> Unit) = initTag(IMG(), init)
    fun input(init: INPUT.() -> Unit) = initTag(INPUT(), init)
    fun ins(init: INS.() -> Unit) = initTag(INS(), init)
    fun kbd(init: KBD.() -> Unit) = initTag(KBD(), init)
    fun keygen(init: KEYGEN.() -> Unit) = initTag(KEYGEN(), init)
    fun label(init: LABEL.() -> Unit) = initTag(LABEL(), init)
    fun legend(init: LEGEND.() -> Unit) = initTag(LEGEND(), init)
    fun li(init: LI.() -> Unit) = initTag(LI(), init)
    fun main(init: MAIN.() -> Unit) = initTag(MAIN(), init)
    fun map(init: MAP.() -> Unit) = initTag(MAP(), init)
    fun mark(init: MARK.() -> Unit) = initTag(MARK(), init)
    fun menu(init: MENU.() -> Unit) = initTag(MENU(), init)
    fun menuitem(init: MENUITEM.() -> Unit) = initTag(MENUITEM(), init)
    fun meter(init: METER.() -> Unit) = initTag(METER(), init)
    fun nav(init: NAV.() -> Unit) = initTag(NAV(), init)
    fun `object`(init: OBJECT.() -> Unit) = initTag(OBJECT(), init)
    fun ol(init: OL.() -> Unit) = initTag(OL(), init)
    fun optgroup(init: OPTGROUP.() -> Unit) = initTag(OPTGROUP(), init)
    fun option(init: OPTION.() -> Unit) = initTag(OPTION(), init)
    fun output(init: OUTPUT.() -> Unit) = initTag(OUTPUT(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun param(init: PARAM.() -> Unit) = initTag(PARAM(), init)
    fun picture(init: PICTURE.() -> Unit) = initTag(PICTURE(), init)
    fun pre(init: PRE.() -> Unit) = initTag(PRE(), init)
    fun progress(init: PROGRESS.() -> Unit) = initTag(PROGRESS(), init)
    fun q(init: Q.() -> Unit) = initTag(Q(), init)
    fun rp(init: RP.() -> Unit) = initTag(RP(), init)
    fun rt(init: RT.() -> Unit) = initTag(RT(), init)
    fun ruby(init: RUBY.() -> Unit) = initTag(RUBY(), init)
    fun s(init: S.() -> Unit) = initTag(S(), init)
    fun samp(init: SAMP.() -> Unit) = initTag(SAMP(), init)
    fun section(init: SECTION.() -> Unit) = initTag(SECTION(), init)
    fun select(init: SELECT.() -> Unit) = initTag(SELECT(), init)
    fun small(init: SMALL.() -> Unit) = initTag(SMALL(), init)
    fun source(init: SOURCE.() -> Unit) = initTag(SOURCE(), init)
    fun span(init: SPAN.() -> Unit) = initTag(SPAN(), init)
    fun strong(init: STRONG.() -> Unit) = initTag(STRONG(), init)
    fun sub(init: SUB.() -> Unit) = initTag(SUB(), init)
    fun summary(init: SUMMARY.() -> Unit) = initTag(SUMMARY(), init)
    fun sup(init: SUP.() -> Unit) = initTag(SUP(), init)
    fun table(init: TABLE.() -> Unit) = initTag(TABLE(), init)
    fun tbody(init: TBODY.() -> Unit) = initTag(TBODY(), init)
    fun td(init: TD.() -> Unit) = initTag(TD(), init)
    fun textarea(init: TEXTAREA.() -> Unit) = initTag(TEXTAREA(), init)
    fun tfoot(init: TFOOT.() -> Unit) = initTag(TFOOT(), init)
    fun th(init: TH.() -> Unit) = initTag(TH(), init)
    fun thead(init: THEAD.() -> Unit) = initTag(THEAD(), init)
    fun time(init: TIME.() -> Unit) = initTag(TIME(), init)
    fun tr(init: TR.() -> Unit) = initTag(TR(), init)
    fun track(init: TRACK.() -> Unit) = initTag(TRACK(), init)
    fun u(init: U.() -> Unit) = initTag(U(), init)
    fun ul(init: UL.() -> Unit) = initTag(UL(), init)
    fun `var`(init: VAR.() -> Unit) = initTag(VAR(), init)
    fun video(init: VIDEO.() -> Unit) = initTag(VIDEO(), init)
    fun wbr(init: WBR.() -> Unit) = initTag(WBR(), init)
    fun circle(init: CIRCLE.() -> Unit) = initTag(CIRCLE(), init)
    fun clipPath(init: CLIPPATH.() -> Unit) = initTag(CLIPPATH(), init)
    fun defs(init: DEFS.() -> Unit) = initTag(DEFS(), init)
    fun ellipse(init: ELLIPSE.() -> Unit) = initTag(ELLIPSE(), init)
    fun g(init: G.() -> Unit) = initTag(G(), init)
    fun image(init: IMAGE.() -> Unit) = initTag(IMAGE(), init)
    fun line(init: LINE.() -> Unit) = initTag(LINE(), init)
    fun linearGradient(init: LINEARGRADIENT.() -> Unit) = initTag(LINEARGRADIENT(), init)
    fun mask(init: MASK.() -> Unit) = initTag(MASK(), init)
    fun path(init: PATH.() -> Unit) = initTag(PATH(), init)
    fun pattern(init: PATTERN.() -> Unit) = initTag(PATTERN(), init)
    fun polygon(init: POLYGON.() -> Unit) = initTag(POLYGON(), init)
    fun polyline(init: POLYLINE.() -> Unit) = initTag(POLYLINE(), init)
    fun radialGradient(init: RADIALGRADIENT.() -> Unit) = initTag(RADIALGRADIENT(), init)
    fun rect(init: RECT.() -> Unit) = initTag(RECT(), init)
    fun stop(init: STOP.() -> Unit) = initTag(STOP(), init)
    fun svg(init: SVG.() -> Unit) = initTag(SVG(), init)
    fun text(init: TEXT.() -> Unit) = initTag(TEXT(), init)
    fun tspan(init: TSPAN.() -> Unit) = initTag(TSPAN(), init)
}

class BASE() : HeadTag("base")
class LINK() : HeadTag("link")
class META() : HeadTag("meta")
class NOSCRIPT() : HeadTag("noscript")
class SCRIPT() : HeadTag("script")
class STYLE() : HeadTag("style")
class TITLE() : HeadTag("title")
class A() : BodyTag("a")
class ABBR() : BodyTag("abbr")
class ADDRESS() : BodyTag("address")
class AREA() : BodyTag("area")
class ARTICLE() : BodyTag("article")
class ASIDE() : BodyTag("aside")
class AUDIO() : BodyTag("audio")
class B() : BodyTag("b")
class BDI() : BodyTag("bdi")
class BDO() : BodyTag("bdo")
class BIG() : BodyTag("big")
class BLOCKQUOTE() : BodyTag("blockquote")
class BODY() : BodyTag("body")
class BR() : BodyTag("br")
class BUTTON() : BodyTag("button")
class CANVAS() : BodyTag("canvas")
class CAPTION() : BodyTag("caption")
class CITE() : BodyTag("cite")
class CODE() : BodyTag("code")
class COL() : BodyTag("col")
class COLGROUP() : BodyTag("colgroup")
class DATA() : BodyTag("data")
class DATALIST() : BodyTag("datalist")
class DD() : BodyTag("dd")
class DEL() : BodyTag("del")
class DETAILS() : BodyTag("details")
class DFN() : BodyTag("dfn")
class DIALOG() : BodyTag("dialog")
class DIV() : BodyTag("div")
class DL() : BodyTag("dl")
class DT() : BodyTag("dt")
class EM() : BodyTag("em")
class EMBED() : BodyTag("embed")
class FIELDSET() : BodyTag("fieldset")
class FIGCAPTION() : BodyTag("figcaption")
class FIGURE() : BodyTag("figure")
class FOOTER() : BodyTag("footer")
class FORM() : BodyTag("form")
class H1() : BodyTag("h1")
class H2() : BodyTag("h2")
class H3() : BodyTag("h3")
class H4() : BodyTag("h4")
class H5() : BodyTag("h5")
class H6() : BodyTag("h6")
class HEAD() : HeadTag("head")
class HEADER() : BodyTag("header")
class HGROUP() : BodyTag("hgroup")
class HR() : BodyTag("hr")
class I() : BodyTag("i")
class IFRAME() : BodyTag("iframe")
class IMG() : BodyTag("img")
class INPUT() : BodyTag("input")
class INS() : BodyTag("ins")
class KBD() : BodyTag("kbd")
class KEYGEN() : BodyTag("keygen")
class LABEL() : BodyTag("label")
class LEGEND() : BodyTag("legend")
class LI() : BodyTag("li")
class MAIN() : BodyTag("main")
class MAP() : BodyTag("map")
class MARK() : BodyTag("mark")
class MENU() : BodyTag("menu")
class MENUITEM() : BodyTag("menuitem")
class METER() : BodyTag("meter")
class NAV() : BodyTag("nav")
class OBJECT() : BodyTag("object")
class OL() : BodyTag("ol")
class OPTGROUP() : BodyTag("optgroup")
class OPTION() : BodyTag("option")
class OUTPUT() : BodyTag("output")
class P() : BodyTag("p")
class PARAM() : BodyTag("param")
class PICTURE() : BodyTag("picture")
class PRE() : BodyTag("pre")
class PROGRESS() : BodyTag("progress")
class Q() : BodyTag("q")
class RP() : BodyTag("rp")
class RT() : BodyTag("rt")
class RUBY() : BodyTag("ruby")
class S() : BodyTag("s")
class SAMP() : BodyTag("samp")
class SECTION() : BodyTag("section")
class SELECT() : BodyTag("select")
class SMALL() : BodyTag("small")
class SOURCE() : BodyTag("source")
class SPAN() : BodyTag("span")
class STRONG() : BodyTag("strong")
class SUB() : BodyTag("sub")
class SUMMARY() : BodyTag("summary")
class SUP() : BodyTag("sup")
class TABLE() : BodyTag("table")
class TBODY() : BodyTag("tbody")
class TD() : BodyTag("td")
class TEXTAREA() : BodyTag("textarea")
class TFOOT() : BodyTag("tfoot")
class TH() : BodyTag("th")
class THEAD() : BodyTag("thead")
class TIME() : BodyTag("time")
class TR() : BodyTag("tr")
class TRACK() : BodyTag("track")
class U() : BodyTag("u")
class UL() : BodyTag("ul")
class VAR() : BodyTag("var")
class VIDEO() : BodyTag("video")
class WBR() : BodyTag("wbr")
class CIRCLE() : BodyTag("circle")
class CLIPPATH() : BodyTag("clipPath")
class DEFS() : BodyTag("defs")
class ELLIPSE() : BodyTag("ellipse")
class G() : BodyTag("g")
class IMAGE() : BodyTag("image")
class LINE() : BodyTag("line")
class LINEARGRADIENT() : BodyTag("linearGradient")
class MASK() : BodyTag("mask")
class PATH() : BodyTag("path")
class PATTERN() : BodyTag("pattern")
class POLYGON() : BodyTag("polygon")
class POLYLINE() : BodyTag("polyline")
class RADIALGRADIENT() : BodyTag("radialGradient")
class RECT() : BodyTag("rect")
class STOP() : BodyTag("stop")
class SVG() : BodyTag("svg")
class TEXT() : BodyTag("text")
class TSPAN() : BodyTag("tspan")

fun base(init: BASE.() -> Unit): BASE {
    val e = BASE()
    e.init()
    return e
}

fun link(init: LINK.() -> Unit): LINK {
    val e = LINK()
    e.init()
    return e
}

fun meta(init: META.() -> Unit): META {
    val e = META()
    e.init()
    return e
}

fun noscript(init: NOSCRIPT.() -> Unit): NOSCRIPT {
    val e = NOSCRIPT()
    e.init()
    return e
}

fun script(init: SCRIPT.() -> Unit): SCRIPT {
    val e = SCRIPT()
    e.init()
    return e
}

fun style(init: STYLE.() -> Unit): STYLE {
    val e = STYLE()
    e.init()
    return e
}

fun title(init: TITLE.() -> Unit): TITLE {
    val e = TITLE()
    e.init()
    return e
}

fun a(init: A.() -> Unit): A {
    val e = A()
    e.init()
    return e
}

fun abbr(init: ABBR.() -> Unit): ABBR {
    val e = ABBR()
    e.init()
    return e
}

fun address(init: ADDRESS.() -> Unit): ADDRESS {
    val e = ADDRESS()
    e.init()
    return e
}

fun area(init: AREA.() -> Unit): AREA {
    val e = AREA()
    e.init()
    return e
}

fun article(init: ARTICLE.() -> Unit): ARTICLE {
    val e = ARTICLE()
    e.init()
    return e
}

fun aside(init: ASIDE.() -> Unit): ASIDE {
    val e = ASIDE()
    e.init()
    return e
}

fun audio(init: AUDIO.() -> Unit): AUDIO {
    val e = AUDIO()
    e.init()
    return e
}

fun b(init: B.() -> Unit): B {
    val e = B()
    e.init()
    return e
}

fun bdi(init: BDI.() -> Unit): BDI {
    val e = BDI()
    e.init()
    return e
}

fun bdo(init: BDO.() -> Unit): BDO {
    val e = BDO()
    e.init()
    return e
}

fun big(init: BIG.() -> Unit): BIG {
    val e = BIG()
    e.init()
    return e
}

fun blockquote(init: BLOCKQUOTE.() -> Unit): BLOCKQUOTE {
    val e = BLOCKQUOTE()
    e.init()
    return e
}

fun body(init: BODY.() -> Unit): BODY {
    val e = BODY()
    e.init()
    return e
}

fun br(init: BR.() -> Unit): BR {
    val e = BR()
    e.init()
    return e
}

fun button(init: BUTTON.() -> Unit): BUTTON {
    val e = BUTTON()
    e.init()
    return e
}

fun canvas(init: CANVAS.() -> Unit): CANVAS {
    val e = CANVAS()
    e.init()
    return e
}

fun caption(init: CAPTION.() -> Unit): CAPTION {
    val e = CAPTION()
    e.init()
    return e
}

fun cite(init: CITE.() -> Unit): CITE {
    val e = CITE()
    e.init()
    return e
}

fun code(init: CODE.() -> Unit): CODE {
    val e = CODE()
    e.init()
    return e
}

fun col(init: COL.() -> Unit): COL {
    val e = COL()
    e.init()
    return e
}

fun colgroup(init: COLGROUP.() -> Unit): COLGROUP {
    val e = COLGROUP()
    e.init()
    return e
}

fun data(init: DATA.() -> Unit): DATA {
    val e = DATA()
    e.init()
    return e
}

fun datalist(init: DATALIST.() -> Unit): DATALIST {
    val e = DATALIST()
    e.init()
    return e
}

fun dd(init: DD.() -> Unit): DD {
    val e = DD()
    e.init()
    return e
}

fun del(init: DEL.() -> Unit): DEL {
    val e = DEL()
    e.init()
    return e
}

fun details(init: DETAILS.() -> Unit): DETAILS {
    val e = DETAILS()
    e.init()
    return e
}

fun dfn(init: DFN.() -> Unit): DFN {
    val e = DFN()
    e.init()
    return e
}

fun dialog(init: DIALOG.() -> Unit): DIALOG {
    val e = DIALOG()
    e.init()
    return e
}

fun div(init: DIV.() -> Unit): DIV {
    val e = DIV()
    e.init()
    return e
}

fun dl(init: DL.() -> Unit): DL {
    val e = DL()
    e.init()
    return e
}

fun dt(init: DT.() -> Unit): DT {
    val e = DT()
    e.init()
    return e
}

fun em(init: EM.() -> Unit): EM {
    val e = EM()
    e.init()
    return e
}

fun embed(init: EMBED.() -> Unit): EMBED {
    val e = EMBED()
    e.init()
    return e
}

fun fieldset(init: FIELDSET.() -> Unit): FIELDSET {
    val e = FIELDSET()
    e.init()
    return e
}

fun figcaption(init: FIGCAPTION.() -> Unit): FIGCAPTION {
    val e = FIGCAPTION()
    e.init()
    return e
}

fun figure(init: FIGURE.() -> Unit): FIGURE {
    val e = FIGURE()
    e.init()
    return e
}

fun footer(init: FOOTER.() -> Unit): FOOTER {
    val e = FOOTER()
    e.init()
    return e
}

fun form(init: FORM.() -> Unit): FORM {
    val e = FORM()
    e.init()
    return e
}

fun h1(init: H1.() -> Unit): H1 {
    val e = H1()
    e.init()
    return e
}

fun h2(init: H2.() -> Unit): H2 {
    val e = H2()
    e.init()
    return e
}

fun h3(init: H3.() -> Unit): H3 {
    val e = H3()
    e.init()
    return e
}

fun h4(init: H4.() -> Unit): H4 {
    val e = H4()
    e.init()
    return e
}

fun h5(init: H5.() -> Unit): H5 {
    val e = H5()
    e.init()
    return e
}

fun h6(init: H6.() -> Unit): H6 {
    val e = H6()
    e.init()
    return e
}

fun head(init: HEAD.() -> Unit): HEAD {
    val e = HEAD()
    e.init()
    return e
}

fun header(init: HEADER.() -> Unit): HEADER {
    val e = HEADER()
    e.init()
    return e
}

fun hgroup(init: HGROUP.() -> Unit): HGROUP {
    val e = HGROUP()
    e.init()
    return e
}

fun hr(init: HR.() -> Unit): HR {
    val e = HR()
    e.init()
    return e
}

fun html(init: HTML.() -> Unit): HTML {
    val e = HTML()
    e.init()
    return e
}

fun i(init: I.() -> Unit): I {
    val e = I()
    e.init()
    return e
}

fun iframe(init: IFRAME.() -> Unit): IFRAME {
    val e = IFRAME()
    e.init()
    return e
}

fun img(init: IMG.() -> Unit): IMG {
    val e = IMG()
    e.init()
    return e
}

fun input(init: INPUT.() -> Unit): INPUT {
    val e = INPUT()
    e.init()
    return e
}

fun ins(init: INS.() -> Unit): INS {
    val e = INS()
    e.init()
    return e
}

fun kbd(init: KBD.() -> Unit): KBD {
    val e = KBD()
    e.init()
    return e
}

fun keygen(init: KEYGEN.() -> Unit): KEYGEN {
    val e = KEYGEN()
    e.init()
    return e
}

fun label(init: LABEL.() -> Unit): LABEL {
    val e = LABEL()
    e.init()
    return e
}

fun legend(init: LEGEND.() -> Unit): LEGEND {
    val e = LEGEND()
    e.init()
    return e
}

fun li(init: LI.() -> Unit): LI {
    val e = LI()
    e.init()
    return e
}

fun main(init: MAIN.() -> Unit): MAIN {
    val e = MAIN()
    e.init()
    return e
}

fun map(init: MAP.() -> Unit): MAP {
    val e = MAP()
    e.init()
    return e
}

fun mark(init: MARK.() -> Unit): MARK {
    val e = MARK()
    e.init()
    return e
}

fun menu(init: MENU.() -> Unit): MENU {
    val e = MENU()
    e.init()
    return e
}

fun menuitem(init: MENUITEM.() -> Unit): MENUITEM {
    val e = MENUITEM()
    e.init()
    return e
}

fun meter(init: METER.() -> Unit): METER {
    val e = METER()
    e.init()
    return e
}

fun nav(init: NAV.() -> Unit): NAV {
    val e = NAV()
    e.init()
    return e
}

fun `object`(init: OBJECT.() -> Unit): OBJECT {
    val e = OBJECT()
    e.init()
    return e
}

fun ol(init: OL.() -> Unit): OL {
    val e = OL()
    e.init()
    return e
}

fun optgroup(init: OPTGROUP.() -> Unit): OPTGROUP {
    val e = OPTGROUP()
    e.init()
    return e
}

fun option(init: OPTION.() -> Unit): OPTION {
    val e = OPTION()
    e.init()
    return e
}

fun output(init: OUTPUT.() -> Unit): OUTPUT {
    val e = OUTPUT()
    e.init()
    return e
}

fun p(init: P.() -> Unit): P {
    val e = P()
    e.init()
    return e
}

fun param(init: PARAM.() -> Unit): PARAM {
    val e = PARAM()
    e.init()
    return e
}

fun picture(init: PICTURE.() -> Unit): PICTURE {
    val e = PICTURE()
    e.init()
    return e
}

fun pre(init: PRE.() -> Unit): PRE {
    val e = PRE()
    e.init()
    return e
}

fun progress(init: PROGRESS.() -> Unit): PROGRESS {
    val e = PROGRESS()
    e.init()
    return e
}

fun q(init: Q.() -> Unit): Q {
    val e = Q()
    e.init()
    return e
}

fun rp(init: RP.() -> Unit): RP {
    val e = RP()
    e.init()
    return e
}

fun rt(init: RT.() -> Unit): RT {
    val e = RT()
    e.init()
    return e
}

fun ruby(init: RUBY.() -> Unit): RUBY {
    val e = RUBY()
    e.init()
    return e
}

fun s(init: S.() -> Unit): S {
    val e = S()
    e.init()
    return e
}

fun samp(init: SAMP.() -> Unit): SAMP {
    val e = SAMP()
    e.init()
    return e
}

fun section(init: SECTION.() -> Unit): SECTION {
    val e = SECTION()
    e.init()
    return e
}

fun select(init: SELECT.() -> Unit): SELECT {
    val e = SELECT()
    e.init()
    return e
}

fun small(init: SMALL.() -> Unit): SMALL {
    val e = SMALL()
    e.init()
    return e
}

fun source(init: SOURCE.() -> Unit): SOURCE {
    val e = SOURCE()
    e.init()
    return e
}

fun span(init: SPAN.() -> Unit): SPAN {
    val e = SPAN()
    e.init()
    return e
}

fun strong(init: STRONG.() -> Unit): STRONG {
    val e = STRONG()
    e.init()
    return e
}

fun sub(init: SUB.() -> Unit): SUB {
    val e = SUB()
    e.init()
    return e
}

fun summary(init: SUMMARY.() -> Unit): SUMMARY {
    val e = SUMMARY()
    e.init()
    return e
}

fun sup(init: SUP.() -> Unit): SUP {
    val e = SUP()
    e.init()
    return e
}

fun table(init: TABLE.() -> Unit): TABLE {
    val e = TABLE()
    e.init()
    return e
}

fun tbody(init: TBODY.() -> Unit): TBODY {
    val e = TBODY()
    e.init()
    return e
}

fun td(init: TD.() -> Unit): TD {
    val e = TD()
    e.init()
    return e
}

fun textarea(init: TEXTAREA.() -> Unit): TEXTAREA {
    val e = TEXTAREA()
    e.init()
    return e
}

fun tfoot(init: TFOOT.() -> Unit): TFOOT {
    val e = TFOOT()
    e.init()
    return e
}

fun th(init: TH.() -> Unit): TH {
    val e = TH()
    e.init()
    return e
}

fun thead(init: THEAD.() -> Unit): THEAD {
    val e = THEAD()
    e.init()
    return e
}

fun time(init: TIME.() -> Unit): TIME {
    val e = TIME()
    e.init()
    return e
}

fun tr(init: TR.() -> Unit): TR {
    val e = TR()
    e.init()
    return e
}

fun track(init: TRACK.() -> Unit): TRACK {
    val e = TRACK()
    e.init()
    return e
}

fun u(init: U.() -> Unit): U {
    val e = U()
    e.init()
    return e
}

fun ul(init: UL.() -> Unit): UL {
    val e = UL()
    e.init()
    return e
}

fun `var`(init: VAR.() -> Unit): VAR {
    val e = VAR()
    e.init()
    return e
}

fun video(init: VIDEO.() -> Unit): VIDEO {
    val e = VIDEO()
    e.init()
    return e
}

fun wbr(init: WBR.() -> Unit): WBR {
    val e = WBR()
    e.init()
    return e
}

fun circle(init: CIRCLE.() -> Unit): CIRCLE {
    val e = CIRCLE()
    e.init()
    return e
}

fun clipPath(init: CLIPPATH.() -> Unit): CLIPPATH {
    val e = CLIPPATH()
    e.init()
    return e
}

fun defs(init: DEFS.() -> Unit): DEFS {
    val e = DEFS()
    e.init()
    return e
}

fun ellipse(init: ELLIPSE.() -> Unit): ELLIPSE {
    val e = ELLIPSE()
    e.init()
    return e
}

fun g(init: G.() -> Unit): G {
    val e = G()
    e.init()
    return e
}

fun image(init: IMAGE.() -> Unit): IMAGE {
    val e = IMAGE()
    e.init()
    return e
}

fun line(init: LINE.() -> Unit): LINE {
    val e = LINE()
    e.init()
    return e
}

fun linearGradient(init: LINEARGRADIENT.() -> Unit): LINEARGRADIENT {
    val e = LINEARGRADIENT()
    e.init()
    return e
}

fun mask(init: MASK.() -> Unit): MASK {
    val e = MASK()
    e.init()
    return e
}

fun path(init: PATH.() -> Unit): PATH {
    val e = PATH()
    e.init()
    return e
}

fun pattern(init: PATTERN.() -> Unit): PATTERN {
    val e = PATTERN()
    e.init()
    return e
}

fun polygon(init: POLYGON.() -> Unit): POLYGON {
    val e = POLYGON()
    e.init()
    return e
}

fun polyline(init: POLYLINE.() -> Unit): POLYLINE {
    val e = POLYLINE()
    e.init()
    return e
}

fun radialGradient(init: RADIALGRADIENT.() -> Unit): RADIALGRADIENT {
    val e = RADIALGRADIENT()
    e.init()
    return e
}

fun rect(init: RECT.() -> Unit): RECT {
    val e = RECT()
    e.init()
    return e
}

fun stop(init: STOP.() -> Unit): STOP {
    val e = STOP()
    e.init()
    return e
}

fun svg(init: SVG.() -> Unit): SVG {
    val e = SVG()
    e.init()
    return e
}

fun text(init: TEXT.() -> Unit): TEXT {
    val e = TEXT()
    e.init()
    return e
}

fun tspan(init: TSPAN.() -> Unit): TSPAN {
    val e = TSPAN()
    e.init()
    return e
}

var A.href: String
    get() = attributes["href"] ?: ""
    set(value) {
        attributes["href"] = value
    }

var IMG.src: String
    get() = attributes["src"] ?: ""
    set(value) {
        attributes["src"] = value
    }


