package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bruno"
    var cpf: String = "120.120.120-12"
}

fun main(){
    val p1 = Pessoa()

    println(p1.nome)
    println(p1.cpf)
}