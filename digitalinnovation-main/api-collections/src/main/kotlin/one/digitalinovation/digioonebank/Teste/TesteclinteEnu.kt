package one.digitalinovation.digioonebank.Teste

import one.digitalinovation.digioonebank.ClienteTipo

fun main() {
  ClienteTipo.values().forEach { elementos ->
      println("${elementos.name} - ${elementos.descricao}")
  }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.pf
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.pj
    println(">>${pj.name} - ${pj.descricao}")
}