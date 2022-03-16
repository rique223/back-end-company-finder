package br.com.devfs.projetodevfskotlin.addressGeocoding

import br.com.devfs.projetodevfskotlin.HttpClientAdapter
import br.com.devfs.projetodevfskotlin.addressGeocoding.config.MapsProps
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AddressGeocodingPortImpl(
    @Value("\${maps.apiKey}")
    val mapsProps: MapsProps,
    private val httpClientAdapter: HttpClientAdapter<GeocodedAddress>,
): AddressGeocodingPort {

    override fun getGeocodedAddress(address: String): String {

        return httpClientAdapter.get("https://maps.googleapis.com/maps/api/geocode/json?address=$address+&key=${mapsProps.apiKey}", null, null)

    }

}