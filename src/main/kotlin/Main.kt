fun main(){
   try {
       var s : String? = null
       println(s!!.length)
       val a = 10/0
   } catch (e: NullPointerException) {
       println("Variavel nula!")
   }
    catch (e: ArithmeticException){
        println("Impossivel dividir por zero")
    }
    catch (e: Exception){
        println("Generica")
    }
    println("Fim")
}