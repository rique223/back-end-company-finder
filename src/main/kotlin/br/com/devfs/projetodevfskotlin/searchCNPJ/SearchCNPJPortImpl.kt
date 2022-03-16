package br.com.devfs.projetodevfskotlin.searchCNPJ

import CompanyData
import br.com.devfs.projetodevfskotlin.HttpClientAdapter
import org.springframework.stereotype.Component

@Component
class SearchCNPJPortImpl(
    private val httpClientAdapter: HttpClientAdapter<CompanyData>
): SearchCNPJPort {
    override fun getCompanyDataByCNPJ(CNPJ: String): String {

        return httpClientAdapter.get("https://www.receitaws.com.br/v1/cnpj/$CNPJ", null, null)

    }
}