package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Conta

fun main() {
    val contaJuan = Conta(
        numero = "13444-5",
        agencia = "0857"
    )

    println(contaJuan)

    try {
        contaJuan.saque(10.0)
    } catch (e: Exception) {
        println(e.message)
        contaJuan.deposito(150.0)
    }

    println(contaJuan)
}

