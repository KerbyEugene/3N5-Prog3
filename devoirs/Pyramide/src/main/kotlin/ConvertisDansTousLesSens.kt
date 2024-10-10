fun main(args:Array<String>){
    for (arg in args)
    {
        try {
            val conversion=arg.toInt()
            val IntToFloat=conversion.toFloat()
            val FloatTODouble=IntToFloat.toDouble()
            val intToString=conversion.toString()
            println(arg + " Int to float = " + IntToFloat + " Float to double = " + FloatTODouble+ " int to string = " + intToString)
        }
        catch (nfe:NumberFormatException)
        {
            println("convertion impossible")
        }
    }
}