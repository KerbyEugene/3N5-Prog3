fun main(List:Array<String>){
    for (arg:String in List)
    {
        try {
            val conversion=arg.toInt()
            val binaire=Integer.toBinaryString(conversion)
            println("int = "+ arg + " binaire = "+binaire)
        }
        catch (nfe:NumberFormatException)
        {
            println("convertion impossible")
        }
    }
}