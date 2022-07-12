package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val Juan = Analista("Juan", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(Juan)
}
