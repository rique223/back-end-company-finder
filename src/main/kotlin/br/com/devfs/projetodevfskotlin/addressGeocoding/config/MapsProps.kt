package br.com.devfs.projetodevfskotlin.addressGeocoding.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(
    prefix = "maps"
)
data class MapsProps(
    val apiKey: String,
)