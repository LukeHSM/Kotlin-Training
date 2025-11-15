fun main(){
    val time = Team("Generic team", mutableListOf(
        BasketballPlayer("Jorge"),
        BasketballPlayer("Juca"),
        FootballPlayer("Felix"),
        FootballPlayer("Abner")
        ))

    println(time)
}

open class Player(val name: String)

class BasketballPlayer(name: String): Player(name){
    override fun toString(): String {
        return "Basketball player: ${this.name}"
    }
}
class FootballPlayer(name: String): Player(name){
    override fun toString(): String {
        return "Football player: ${this.name}"
    }
}

data class Team<T>(val name: String, val members: List<T>)