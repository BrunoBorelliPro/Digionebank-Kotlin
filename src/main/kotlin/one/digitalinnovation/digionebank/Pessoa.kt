package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bruno"
    var cpf: String = "120.120.120-12"

    inner class Endereco{
        var rua: String = "Rua teste"
    }
}

fun main(){
    val p1 = Pessoa()

    println(p1.nome)
    println(p1.cpf)

    println(p1.Endereco().rua)
}