package br.com.devfs.projetodevfskotlin

import okhttp3.OkHttpClient
import okhttp3.Request
import org.springframework.stereotype.Component

@Component
class HttpClientAdapterImpl<T>: HttpClientAdapter<T> {

    private val client = OkHttpClient()

    override fun get(
        path: String,
        header: Map<String, String>?,
        payload: Map<String, Any>?,
    ): String {

        val request = Request.Builder()
            .url(path)
            .get()
            .addHeader("Content-Type", "application/json")
            .build()

        client.newCall(request).execute().use { response -> return response.body!!.string()  }

    }

}