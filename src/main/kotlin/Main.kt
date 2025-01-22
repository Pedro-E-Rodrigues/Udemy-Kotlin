class Pessoa(val anoNascimento: Int, var nome: String) {
    var documento: String = ""

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome)

    fun acordar() {

    }

    fun dormir() {

    }
}

fun main() {
    // class - comportamentos e atributos

    // classe (Instancia) objetos
    var pessoa: Pessoa = Pessoa(2003, "Pedro", doc = "2156416439")

    //this - se refere ao objeto
    pessoa.nome

    pessoa.acordar()

    pessoa.dormir()


}

