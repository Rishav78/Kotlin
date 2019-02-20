fun main(args: Array<String>) {
    var ob = child(1,2)
    println(ob.valueOfX())
    println(ob.valueOfY())
}

open class parent(var x:Int){ // here by default all the classes are public and final which means we can not inherit them. So to make inheritance possible we have to frist open the class that is remove final property
    open fun valueOfX(): Int{// same thing goes for functions too
        return x;
    }
}

class child(x:Int, var y:Int) : parent(x){
    init{
        this.x = x
    }
    override fun valueOfX(): Int{// here override keyword tell the compiler that we r overriding this function
        return y;
    }
    fun valueOfY(): Int{
        return y
    }
}