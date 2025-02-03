fun main(){
     val f1: Forma = Forma(10,20)
     val f2: Forma = Forma(10,20)
    f1.equals(f2)
    println(f1.toString())
    println(f1.hashCode())
    println("------------")
    println(f2.toString())
    println(f2.hashCode())
}


class Forma(val a:Int,val b:Int)
data class FormaData(val a: Int, val b: Int)