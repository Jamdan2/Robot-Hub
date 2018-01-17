package com.jamdan2.robohub

import kotlin.browser.*
import kotlinext.js.*
import react.dom.*
import react.router.dom.*

fun main(args: Array<String>) {
    require("styles.css")
    window.onload = {
        render(document.getElementById("root")!!) {
           browserRouter {
                application()
           }
        }
        println("Hello, world!")
    }
}