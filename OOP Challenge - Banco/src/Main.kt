fun main(){
    val conta1 = Conta(Pessoa("Breno"), 150)

    while (true){
        println("""MENU:
            |
            |1 - Saldo
            |2 - Saque
            |3 - Depósito
            |4 - Sair
            |
        """.trimMargin())

        print("Opção: ")
        var num = readln().toInt()

        when (num){
            1 -> conta1.verSaldo()
            2 -> conta1.sacar()
            3 -> conta1.depositar()
            4 -> break
        }

        println("\n-------------------------------\n")
    }
}

class Pessoa(val nome: String)

class Conta(val cliente: Pessoa, var saldo: Int = 0){
    fun verSaldo() = println("O saldo atual do cliente ${cliente.nome} é R$${String.format("%.2f", this.saldo.toDouble())}")

    fun sacar(){
        print("Valor do saque: ")
        val quantia = readln().toInt()
        this.saldo -= quantia
    }

    fun depositar(){
        print("Valor do depósito: ")
        val quantia = readln().toInt()
        this.saldo += quantia
    }
}