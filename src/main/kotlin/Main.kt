fun main(){
     val f1: FormaData = FormaData(10,20)
     val f2: FormaData = FormaData(10,20)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("------------")
    println(f2.toString())
    println(f2.hashCode())
}


class Forma(val a:Int,val b:Int)
data class FormaData(val a: Int, val b: Int) {}