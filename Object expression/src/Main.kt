fun main(){
    val btnLogin = OnClickListener("Login", 2234, object: ClickListener{
        override fun onClick() {
            println("Clicando no botão de login...")
        }
    })
}

class OnClickListener(val text: String, val id: Int, clickListener: ClickListener): ClickListener{
    override fun onClick() {

    }

}

interface ClickListener {
    fun onClick()
}