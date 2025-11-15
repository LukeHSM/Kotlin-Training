
fun main(){
    val footballTeam = Team<FootballPlayer>("Football Team", mutableListOf())
    footballTeam.addMember(FootballPlayer("Jorge"))
    footballTeam.addMember(FootballPlayer("Kelson"))
    footballTeam.addMember(FootballPlayer("Botelho Pinto"))
    println(footballTeam)

    val basketballTeam = Team<BasketballPlayer>("Basketball Team", mutableListOf())
    basketballTeam.addMember(BasketballPlayer("BiroLiro"))
    basketballTeam.addMember(BasketballPlayer("Neco Boneco"))
    basketballTeam.addMember(BasketballPlayer("Omar Melada"))
    println(basketballTeam)

}

open class Player(val name: String)

class BasketballPlayer(name: String): Player(name){
    override fun toString() = "${this.name}"
}
class FootballPlayer(name: String): Player(name){
    override fun toString() = "${this.name}"
}

data class Team<T>(val name: String, val members: MutableList<T>){
    fun addMember(member: T) = members.add(member)
}