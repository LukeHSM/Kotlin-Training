fun main() {
    println("Digite os elementos da lista, separados por vírgulas:")
    val lista = readln().split(", ", " ,", ",", " , ")

    while (true){
        println("""
            
            1 - Começa com...
            2 - Termina com...
            3 - No de caracteres
            4 - Mostrar lista
        """.trimIndent())

        print("\n: ")
        val opcao = readln().toInt()

        when(opcao){
            1 -> comecaCom(lista)
            2 -> terminaCom(lista)
            3 -> numeroChars(lista)
            4 -> mostrarLista(lista)
        }
    }
}

fun comecaCom(lista: List<String>){
    print("\nLetra: ")
    val letra = readln().uppercase()
    val (comMatch, semMatch) = lista.partition { it.uppercase().startsWith(letra) }
    println("Elementos que começam com \"$letra\": ${comMatch.joinToString()}")
    println("Elementos que NÃO começam com \"$letra\": ${semMatch.joinToString()}")
}

fun terminaCom(lista: List<String>){
    print("\nLetra: ")
    val letra = readln().uppercase()
    val (comMatch, semMatch) = lista.partition { it.uppercase().endsWith(letra) }
    println("Elementos que terminam com \"$letra\": ${comMatch.joinToString()}")
    println("Elementos que  NÃO terminam com \"$letra\": ${semMatch.joinToString()}")
}

fun numeroChars(lista: List<String>){
    print("\nQuantidade de chars: ")
    val quantia = readln().toInt()
    val (comMatch, semMatch) = lista.partition { it.length >= quantia }
    println("Elementos com $quantia ou mais caracteres: ${comMatch.joinToString()}")
    println("Elementos com menos de $quantia caracteres: ${semMatch.joinToString()}")
}

fun mostrarLista(lista: List<String>){
    println("\nElementos: ${lista.joinToString()}.")
}