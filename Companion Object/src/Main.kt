fun main(){

    while (true){
        print("Insira o valor total: ")
        var total = readln().toDouble()
        print("Insira a porcentagem: ")
        var percentagem = readln().toDouble()

        println(Calculator.percent(total, percentagem))
    }
}

class Calculator(){

    companion object {
        fun percent(total: Double, perc: Double) = "Valor com desconto: ${total - (total * perc / 100)}\nValor descontado: ${total - (total - (total * perc / 100))}\n"
    }
}