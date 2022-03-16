package br.com.devfs.projetodevfskotlin

interface HttpClientAdapter<T> {

    fun get(
        path: String,
        header: Map<String, String>?,
        payload: Map<String, Any>?,
    ): String

}