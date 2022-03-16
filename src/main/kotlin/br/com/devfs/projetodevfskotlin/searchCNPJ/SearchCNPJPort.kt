package br.com.devfs.projetodevfskotlin.searchCNPJ

interface SearchCNPJPort {

    fun getCompanyDataByCNPJ(CNPJ: String): String

}