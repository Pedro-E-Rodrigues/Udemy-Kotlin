open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    var c = Computador("DELL")
    c.ligar()
    c.desligar()
    c.instalarSoftware()
}