fun main(args: Array<String>) {
    val a:Int = 12
    val w:Int = when(a)
    {
        !in 1..13 -> {
            println(10)
            a
        }
        13,14 -> {
            println(12)
            a+1
        }
        else ->{
            println("Who cares")
            a+2
        }
    }
    println(w)
}