fun main(){
    println(media(false,10f, 8f,"",false,9f))

    arrayOf(0,2,3,6,2,6,45f,false)
}

fun <T, J> media(abc: J,vararg notas: T ): Float{
    var soma = 0f
    for (n in notas){
        if (n is Float) {
            soma += n
        }

    }
    return (soma / notas.size)
}