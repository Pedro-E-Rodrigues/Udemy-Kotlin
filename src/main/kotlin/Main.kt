fun triangulo() {
    println("informe o lado 1 do triangulo:")
    val lado1 = readln()

    println("informe o lado 2 do triangulo:")
    val lado2 = readln()

    println("informe o lado 3 do triangulo:")
    val lado3 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("É um triangulo equilatero")
        } else {
            println("Nao é equilatero")
        }
    }
}

fun quadrado() {
    println("informe o lado 1:")
    val lado1 = readln()

    println("informe o lado 2:")
    val lado2 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (lado1 == lado2) {
            println("é um quadrado")
        } else {
            println("nao é um quadrado")
        }
    }
}

fun portaria() {
    println("Informe sua idade:")
    val idade = readln()

    if (idade != null && idade != "") {
        val x = idade.toInt()

        if (x < 18) {
            println("Negado. Menores de idade nao sao permitidos.")
            return
        } else if (x >= 18) {
            println("Qual o seu tipo de convite?:")
            val convite = readln()

            if (convite != "comum" && convite != "premium" && convite != "luxo") {
                println("Negado. Convite invalido.")
                return

            } else {
                println("Forneça o código do convite:")
                var codigo = readln()

                if (codigo != null && codigo != "") {
                    if (convite == "comum" && codigo.startsWith("XT")) {
                        println("Welcome")
                    } else if (convite == "premium" || convite == "luxo" && codigo.startsWith("XL")) {
                        println("Welcome")
                    } else {
                        println("Negado. Convite invalido")
                    }
                }
            }


        }

    }
}

fun main() {
    //quadrado()
    //triangulo()
    portaria()
}