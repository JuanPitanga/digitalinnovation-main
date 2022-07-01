package one.digitalinovation.digioonebank

class Pessoa {
   var nome: String = "Juan"

    var cpf: String =  "033.637.392-90"
    private set

    constructor()

    fun pessoaINFO() = "$nome + $cpf"
}


fun main() {
    val Juan = Pessoa()

    println(Juan.pessoaINFO())
}