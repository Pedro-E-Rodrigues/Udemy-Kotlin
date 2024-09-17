fun main(){
   try {
       var s : String? = null

       println(s!!.length)
   } catch (e: NullPointerException) {
       println("Variavel nula!")
   }
    println("Fim")
}