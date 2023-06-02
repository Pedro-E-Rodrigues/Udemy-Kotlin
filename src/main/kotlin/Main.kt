//if and else
fun calculabonus(cargo: String, salario: Float): Float {
//Gerente Junior, Gerente Senior, Coordenador

    val bonus: Float
    if (cargo == "Coordenador") {
        bonus = salario * 1.2f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 1.5f
    } else {
        bonus = salario * 2f
    }
    return bonus


}


fun main() {

    println(calculabonus("Coordenador", 1000f))
    println(calculabonus("Gerente Junior", 1000f))
    println(calculabonus("Gerente Senior", 1000f))

}

