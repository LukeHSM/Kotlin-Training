/*
* Lazy initialization com a "BY LAZY {}":
* Somente quando o user3 foi usado no código (após sua declaração/instanciação)...
* que ele foi realmente inicializado...
* como demonstrado pelo acionamento TARDIO de seu bloco init
* */

fun main(){
    val user1 = User("Arthur", "Steverson")
    val user2 = User("Ben", "Stiller")
    val user3 by lazy {
        User("Preguicinha", "Exemplar")
    }

    println("LastName of ${user1.name}: ${user1.lastName}")
    println("LastName of ${user2.name}: ${user2.lastName}")
    println("LastName of ${user3.name}: ${user3.lastName}")
}

class User(val name: String, val lastName: String){
    init {
        println("$name was initialized.")
    }
}