/*
*   Praticando com ENUM:
*   Atributos built-in (name e ordinal)
*   Atributos user-defined (ClientName e idade)
*/

fun main() {
    println(Clientes.CLIENTE1.info())
    println(Clientes.CLIENTE2.info())
    println(Clientes.CLIENTE3.info())
    println(Clientes.CLIENTE4.info())

    println("\n")
    for (i in Clientes.entries) println("O cliente ${i.ClientName} tem ${i.idade} anos de idade.")

}

enum class Clientes(val ClientName: String, var idade: Int){
    CLIENTE1("Andreia", 32),
    CLIENTE2("Bernardo", 53),
    CLIENTE3("Gustavo", 25),
    CLIENTE4("Laura", 48);

    fun info() = "${this.name} - ${this.ordinal}: ${this.ClientName}, ${this.idade} anos."
}