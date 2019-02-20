//Init block act as a secondary constructor wich is use to initilize the variable of constructor
fun main(args: Array<String>) {
    val s = Student("rishav","garg")
    s.display()
}

class Student constructor(name:String){// right now this name is only limited to init method but if we placed var in front of name it will become property of class that is we can use it throughout the class
    var x:Int = 12
    init{
        println("Name: $name $x")
    }
    constructor(x:String, y:String): this(x){// we can not define class property in secondary constructor that we can't write var x:string
        println("$x $y")
    }
    fun display(){

    }
}