fun main(){
    println(media(10f, 8f))
}

fun <T> media(vararg notas: T ): Float{
    var soma = 0f
    for (n in notas){
        if (n is Float) {
            soma += n
        }

    }
    return (soma / notas.size)
}