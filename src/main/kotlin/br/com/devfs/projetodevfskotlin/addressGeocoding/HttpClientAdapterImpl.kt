package br.com.devfs.projetodevfskotlin.addressGeocoding

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.time.Duration

@Component
class HttpClientAdapterImpl<T>: HttpClientAdapter<T> {

    private val restTemplate: RestTemplate = RestTemplateBuilder()
        .setConnectTimeout(Duration.ofSeconds(10))
        .build()

    override fun <T: Any> get(
        path: String,
        header: Map<String, Any>?,
        payload: Map<String, Any>?,
        klass: Class<T>,
    ): T? {

        return restTemplate.getForObject(path, klass)

    }

}