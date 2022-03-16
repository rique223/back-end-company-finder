package br.com.devfs.projetodevfskotlin.searchCNPJ

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/CNPJ-search/v1"])
class SearchCNPJController(
    private val searchCnpjPort: SearchCNPJPort
) {

    @GetMapping("/get-cnpj", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    @CrossOrigin
    fun searchCNPJ(@RequestParam("CNPJ", required = false, defaultValue = "") CNPJ: Number): String {

        return searchCnpjPort.getCompanyDataByCNPJ(CNPJ.toString())

    }

}