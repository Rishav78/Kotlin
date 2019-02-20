fun main(args: Array<String>) {
    println(sum())
}

// @jvmOverloads to use overload function of kotlin in java
fun sum(x:Int = 0, y:Int = 0): Int{
    return x+y
}