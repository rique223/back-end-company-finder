package br.com.devfs.projetodevfskotlin.addressGeocoding

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value=["/api/address-geocoding/v1"])
class AddressGeocodingController(
    private val addressGeocodingPort: AddressGeocodingPort
) {

    @GetMapping("/get-geocode-address", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    @CrossOrigin
    fun addressGeocoding(
        @RequestParam(
            "address",
            required = false,
            defaultValue = ""
        ) address: String
    ): String {

        return addressGeocodingPort.getGeocodedAddress(address)

    }

}