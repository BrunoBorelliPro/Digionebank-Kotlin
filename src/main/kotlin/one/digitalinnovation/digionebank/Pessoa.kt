package one.digitalinnovation.digionebank

class Pessoa(nome: String, cpf: String){
    var nome: String = nome
    private set
    var cpf: String = cpf
    private set

    inner class Endereco{
        var rua: String = "Rua teste"
    }

    fun pessoaInfo() = "Nome: $nome CPF: $cpf"
}

fun main(){
    val p1 = Pessoa("Bruno", "120.120.120-12")

    println(p1.pessoaInfo())

    println(p1.Endereco().rua)
}