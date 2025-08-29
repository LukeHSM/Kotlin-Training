/*
* Exemplo de Singleton SEM a keyword object (Jeito + antigo?):
* Construtor primário privado.
* Usa companion object.
* O metodo verifica se já há uma instancia (variavel instancia)...
* Se for null, cria uma. Se não, ignora...
* Independente do laço if, retorna o valor da instancia para onde foi chamada no main()
*
* ASSIM, todas as variaveis no main() se relacionam
* com a mesma instancia de BancoDeDados (criada pela 1a delas)
* Ao invés de criar várias
* */

fun main(){
    val instancia1 = BancoDeDados.getInstancia()
    println(instancia1)
    val instancia2 = BancoDeDados.getInstancia()
    println(instancia2)
}

class BancoDeDados private constructor(){

    companion object{
        private var instancia: BancoDeDados? = null

        fun getInstancia(): BancoDeDados?{
            if (instancia == null){
                instancia = BancoDeDados()
            }

            return instancia
        }
    }

}