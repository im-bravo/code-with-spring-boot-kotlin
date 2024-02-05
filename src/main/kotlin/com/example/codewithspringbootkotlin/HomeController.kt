package com.example.codewithspringbootkotlin


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Logger

@RestController
class HomeController {
    @GetMapping(value = ["/home"])
    fun home(): String {
        Logger.getLogger("ctl").info("home it is.")
        Logger.getLogger("ctl").info("thread. = ${Thread.currentThread()}")
        return "Test"
    }
}