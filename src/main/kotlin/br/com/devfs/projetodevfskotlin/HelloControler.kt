package br.com.devfs.projetodevfskotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

        @GetMapping("/")
        @ResponseBody
        fun hello(@RequestParam("name", required = false, defaultValue = "World!") name: String): String = "Hello $name"

}