package kpagejs

class KPagejs {
    class Next {  }
    companion object {
        fun addRoute(route: String, callback: RouteFunction) {
            js("page(route,callback.call)")
        }
        fun start(click:Boolean = true, popstate: Boolean = true, dispatch: Boolean = true, hashbang: Boolean = false, decodeURLComponents: Boolean = true){
            js("page({click: click, popstate: popstate, dispatch: dispatch, hashbang: hashbang, decodeURLComponents: decodeURLComponents })")
        }
        fun stop() {
            js("page.stop()")
        }
        fun navigateTo(route:String) {
            js("page(route)")
        }
        fun runNext(next: Next) {
            js("next()")
        }
        fun setBase(base: String) {
            js("page.base(base)")
        }
    }
    var path : String? = null
    var querystring : String? = null
    var pathname : String? = null
    var params : dynamic = null
    var state : dynamic = null
    fun save() {}
    interface RouteFunction {
        @JsName("call")
        fun call(ctx: KPagejs, next: Next)
    }
}