fun main(){
    // objeto (f1) -> endereço mem1
    // objeto (f2) -> endereço mem2

     val f1: FormaData = FormaData(10,20)
     var f2: FormaData

     f2 = f1.copy(50)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("------------")
    println(f2.toString())
    println(f2.hashCode())

    f2 = f1.copy()
}


class Forma(val a:Int,val b:Int)
data class FormaData(val a: Int, val b: Int) {}

data class Endereço(val rua:String,val cep: String, val city:String)
fun endereço(e: Endereço){}