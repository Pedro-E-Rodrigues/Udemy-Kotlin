fun exc1() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun exc2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun exc3() {
    for (i in 1..50) {
        if (i % 5 != 0){
            print("$i ")
        }
    }
}

fun exc4() {
    var soma =0
    for (i in 1..500) {
        soma += i
    }
    println(soma)
}

fun exc5(n: Int){
    for (i in 1..n){
        for(j in 1..i){
            print("#")
        }
        println()
    }
}
fun main() {
    //exc1()
    //exc2()
    //exc3()
    //exc4()
    exc5(10)
}