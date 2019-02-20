/* IN KOTLIN WE HAVE 4 ACCESS SPECIFIER
1> Public
2> Private
3> Protected
4> Internal: it is limited only to a module
 */

 fun main(args: Array<String>) {
     var ob = child()
     ob assign 12
     ob.display()
 }

 open class parent{
     open protected var a:Int = 0
 }

 class child : parent(){
     fun display(){
         println(a)
     }
     infix fun assign(a:Int){
         this.a = a
     }
 }