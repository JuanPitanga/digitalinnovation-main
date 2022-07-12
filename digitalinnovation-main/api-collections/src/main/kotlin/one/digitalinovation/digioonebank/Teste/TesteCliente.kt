package one.digitalinovation.digioonebank.Teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.testes.TesteAutenticacao

fun main() {
    val Juan = Cliente(
        nome = "Juan Victor",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(Juan)

    TesteAutenticacao().autentica(Juan)
}