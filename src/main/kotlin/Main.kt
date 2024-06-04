fun while1() {
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }
    println("cabem $numBaloes baloes na caixa de água")
}

fun main() {
    while1()
}