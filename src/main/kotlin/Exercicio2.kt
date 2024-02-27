//1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
//minutos e segundos. Saída desejada:
//2 anos equivalem a:
//24 meses
//730 dias
//17520 horas
//1051200 minutos
//63072000 segundos
//2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
//3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
//4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
//5. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
//a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
//b. Escrever uma função para a troca de letras e impressão do valor final.
//c. String final deve estar com todas as letras minúsculas.

fun converte(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24}")
    println("${anos * 365 * 24 * 60}")
    println("${anos * 365 * 24 * 60 * 60}")

}

fun letras(str: String): Int {
    return str.length
}

fun cubo(n: Int): Int {
    return n * n * n
}

fun milhas(milhas: Float): Float {
    return milhas * 1.6f
}

fun ex5(str: String) {
    println( str.replace("A","x").replace("a","x").lowercase())

}

fun main() {
    //converte(2)
    letras("asdafasgagsahhaghasgha")
    cubo(3)
    milhas(100f)
    ex5("aAaAAAAaaAaAAA")
}
