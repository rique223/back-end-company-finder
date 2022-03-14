package br.com.devfs.projetodevfskotlin.addressGeocoding

interface HttpClientAdapter<T> {

    fun <T: Any> get(
        path: String,
        header: Map<String, Any>?,
        payload: Map<String, Any>?,
        klass: Class<T>,
    ): T?

}