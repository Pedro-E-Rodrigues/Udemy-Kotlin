fun bonus(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus

}

fun exc1(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus

}

fun bonuswhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun main() {
    val bonus = bonus("Gerente", 3)
    println(bonus)

    val teste = exc1("Estagiario")
    println(teste)

    val bonuswhen = bonuswhen("Engenheiro")
    println(bonuswhen)
}