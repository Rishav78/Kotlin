// use to add a function in class without defining it in the class
// it can also be use to add some funtion in pre defined class to like class string 
fun main(args: Array<String>) {
    var ob = Student(rollNo=1710991661,name="Rishav")
    ob.change(rollNo=1710991687,name="rupam")
    ob.display()
}

class Student(var name:String, var rollNo:Int){
    fun display()
    {
        println("Name: ${name}")
        println("RollNo: ${rollNo}")
    }
}

fun Student.change(name:String, rollNo:Int){
    this.name=name
    this.rollNo=rollNo
}