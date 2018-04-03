import kpagejs.KPagejs
import kotlin.browser.window

fun main(args: Array<String>){
    KPagejs.addRoute("/test/:vald", object : KPagejs.RouteFunction {
        override fun call(ctx: KPagejs, next: KPagejs.Next) {
            window.alert(ctx.params.vald)
        }
    })
    KPagejs.start(popstate = false, hashbang = true)
}