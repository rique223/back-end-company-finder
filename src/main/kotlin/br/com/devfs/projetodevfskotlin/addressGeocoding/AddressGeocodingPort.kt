package br.com.devfs.projetodevfskotlin.addressGeocoding

interface AddressGeocodingPort {

    fun getGeocodedAddress(address: String): GeocodedAddress?

}