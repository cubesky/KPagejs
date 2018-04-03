# KPagejs
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](https://raw.githubusercontent.com/cubesky/Kefjs/master/LICENSE)

A Kotlin/JS Wrapper for [page.js](https://visionmedia.github.io/page.js/)

Related project:
  * [page.js](https://github.com/visionmedia/page.js)

## Usage
Import KPagejs from [CubeSky Repo](https://cubesky-mvn.github.io/) with Maven or Gradle.

```kotlin
KPagejs.addRoute("route", RouteFunction) // Add route

KPagejs.start(click:Boolean = true, popstate: Boolean = true, dispatch: Boolean = true, hashbang: Boolean = false, decodeURLComponents: Boolean = true) // Start Page.js same as `page({/* Option */})`

KPagejs.stop() // Stop page.js

KPagejs.navigateTo(route) // Navigate To route

KPagejs.runNext(Next) //Only used for RouteFunction to call `next()`

KPagejs.setBase(base) // Base Url

val routefunction = object : RouteFunction {
  override fun call(ctx: KPagejs, next: KPagejs.Next) {
    // These verbose is same as page.js Context
    ctx.path
    ctx.querystring
    ctx.pathname
    ctx.params
    ctx.state
    ctx.save()
  }
}
```

## LICENSE
]MIT](https://github.com/cubesky/KPagejs/blob/master/LICENSE)