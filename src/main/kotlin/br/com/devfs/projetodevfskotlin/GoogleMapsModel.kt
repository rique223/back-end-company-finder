package br.com.devfs.projetodevfskotlin

import config.MapsProps
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.time.Duration

@RestController
class GoogleMapsModel(
    @Value("\${maps.apiKey}")
    val mapsProps: MapsProps
    ) {

    @GetMapping("/getGeocodedAddress", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    @CrossOrigin
    fun getGeocodedAddress(@RequestParam("address", required = false, defaultValue = "") address: String): ResponseEntity<GeocodedAddress> {
        fun restTemplate(): RestTemplate = RestTemplateBuilder()
            .setConnectTimeout(Duration.ofSeconds(10))
            .build()

        val geocodingURL = "https://maps.googleapis.com/maps/api/geocode/json?address=$address+&key=${mapsProps.apiKey}"
        
        val response = restTemplate().getForObject(geocodingURL, GeocodedAddress::class.java)

        return ResponseEntity.ok(response)
    }

}