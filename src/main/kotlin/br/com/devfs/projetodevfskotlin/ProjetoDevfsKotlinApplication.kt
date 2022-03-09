package br.com.devfs.projetodevfskotlin

import config.MapsProps
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(MapsProps::class)
open class ProjetoDevfsKotlinApplication

fun main(args: Array<String>) {
    runApplication<ProjetoDevfsKotlinApplication>(*args)
}
