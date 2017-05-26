package com.imon.resources

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WeekendsInMonthResource {

    @RequestMapping("/weekends")
    fun greetings(@RequestParam(value = "month", defaultValue = "1") name: String): List<Int> {
        val weekends: List<Int> = listOf(1, 2, 3)
        return weekends

    }
}