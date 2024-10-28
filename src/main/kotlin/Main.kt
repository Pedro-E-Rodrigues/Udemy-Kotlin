fun main(){
    println(media(10f, 8f))
}

fun media(vararg notas: Float ): Float{
    var soma = 0f
    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}