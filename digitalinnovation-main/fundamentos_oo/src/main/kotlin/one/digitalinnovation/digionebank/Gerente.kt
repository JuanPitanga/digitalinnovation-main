package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean {
        TODO("Not yet implemented")
    }


}