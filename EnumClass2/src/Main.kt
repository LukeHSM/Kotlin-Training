
/*
* Usando o enum de maneira mais genérica (com ".valueOf(name)")
* */
fun main(){
    var cond = false

    do {
        print("Direction: ")
        var userDir = readln().uppercase()

        // Verificação
        for (direction in Direction.entries){
            if (direction.name == userDir) {
                cond = true
                println("It's a ${Direction.valueOf(userDir).distance}-kilometer distance.")
            }
        }

    } while (!cond)
}

enum class Direction(val distance: Int) {
    NORTH(1225),
    SOUTH(452),
    EAST(1523),
    WEST(854)
}