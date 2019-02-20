fun main(args: Array<String>) {
    MyLoop@ for(x in 1..3)
    {
        for(y in 1..3)
        {
            println("$x $y")
            if(x==2 && y==2)
            {
                break@MyLoop
            }
        }
    }
}