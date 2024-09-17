fun main(){
   try {
       var s : String? = null
       val a = 10/0
       println(s!!.length)
   } catch (e: NullPointerException) {
       println("Variavel nula!")
   }
    catch (e: ArithmeticException){
        println("Impossivel dividir por zero")
    }
    println("Fim")
}