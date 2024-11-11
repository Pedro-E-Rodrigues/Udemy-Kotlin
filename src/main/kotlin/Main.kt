class Pessoa(val anoNascimento: Int, var nome: String) {
    fun acordar() {

    }

    fun dormir() {

    }
}

fun main() {
    // class - comportamentos e atributos

    // classe (Instancia) objetos
    var pessoa: Pessoa = Pessoa(2003, "Pedro")

    pessoa.nome

    pessoa.acordar()

    pessoa.dormir()


}

