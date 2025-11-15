fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val wanted = 15
    println(linearSearch(wanted, numbers))
    println("\n==============================\n")
    println(binarySearch(wanted, numbers))
}

fun linearSearch(numberSearched: Int, lista: List<Int>): Any {
    var count = 0
    for (x in lista){
        if (x == numberSearched){
            count++
            return "The number $numberSearched is in this list! (after $count iteration(s))"
        } else {
            count++
            println("$x -> $count iteration(s)")
        }
    }
    return -1
}

fun binarySearch(numberSearched: Int, lista: List<Int>): Any {
    lista.sorted()
    var mid = lista.size / 2 - 1
    var higher = lista[lista.last()] // ?????
    var lower = lista.first() // ?????
    var index = 0
    var count = 0

    if (numberSearched >= mid){
        println("The mid = $mid")
        index = mid
        for (x in lista.slice(index..higher - 1)){
            if (x == numberSearched){
                count++
                return "The number $numberSearched is in this list! (after $count iteration(s))"
            } else {
                count++
                println("$x -> $count iteration(s)")
            }
        }
    }else if (numberSearched < mid){
        println("The mid = $mid")
        index = mid
        for (x in lista.slice(index  downTo lower - 1)){
            if (x == numberSearched){
                count++
                return "The number $numberSearched is in this list! (after $count iteration(s))"
            } else {
                count++
                println("$x -> $count iteration(s)")
            }
        }
    }

    return -1
}