fun main(){
    println(BancoDeDados)
    println(BancoDeDados)
    println(BancoDeDados)
    println(BancoDeDados)
}

object BancoDeDados { // Não precisa de constructor
    init {
        println("Banco de dados iniciado...")
        // O bloco init só roda na primeira chamada
        // quando a instância é criada de fato
    }
}