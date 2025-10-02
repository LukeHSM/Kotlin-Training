fun main(){

    // First collection 2D
    val set2D = setOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    // Second collection 2D
    print("Strings separadas por espaço: ")
    val lista1D = readln().split(" ")
    val lista2D = listOf(lista1D, lista1D)

    println("\n")
    println("Set2D: $set2D")
    println("Flatset: ${set2D.flatten()}")
    println("\n")
    println("Lista2D: $lista2D")
    println("FlatLista: ${lista2D.flatten()}")

}