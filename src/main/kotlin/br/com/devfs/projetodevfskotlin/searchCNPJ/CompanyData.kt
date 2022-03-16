data class CompanyData(
    val abertura: String?,
    val atividade_principal: AtividadePrincipal?,
    val atividades_secundarias: List<AtividadesSecundaria>?,
    val bairro: String?,
    val billing: Billing?,
    val capital_social: String?,
    val cep: String?,
    val cnpj: String?,
    val complemento: String?,
    val data_situacao: String?,
    val data_situacao_especial: String?,
    val efr: String?,
    val email: String?,
    val fantasia: String?,
    val logradouro: String?,
    val motivo_situacao: String?,
    val municipio: String?,
    val natureza_juridica: String?,
    val nome: String?,
    val numero: String?,
    val porte: String?,
    val qsa: List<Qsa>?,
    val situacao: String?,
    val situacao_especial: String?,
    val status: String?,
    val telefone: String?,
    val tipo: String?,
    val uf: String?,
    val ultima_atualizacao: String?
)

data class AtividadePrincipal(
    val code: String?,
    val text: String?
)

data class AtividadesSecundaria(
    val code: String?,
    val text: String?
)

data class Billing(
    val database: Boolean?,
    val free: Boolean?
)

data class Qsa(
    val nome: String?,
    val nome_rep_legal: String?,
    val pais_origem: String?,
    val qual: String?,
    val qual_rep_legal: String?
)