package one.digitalinovation.digioonebank.Teste

import one.digitalinovation.digioonebank.Bank

fun main(){
    val digioneBank = Bank(nome ="digioneBank", numero = 12)


    println(digioneBank.nome)
    println(digioneBank.numero)

    val banco2 = digioneBank.copy(nome = "Banco2")

    println(banco2.info())

}