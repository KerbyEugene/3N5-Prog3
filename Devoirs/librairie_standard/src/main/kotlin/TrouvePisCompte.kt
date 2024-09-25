fun main(){
    var liste= listOf(0,0,0,1,2,3)

    trouve(0,liste)
    compte(0,liste)
}

fun trouve(element: Int,liste:List<Int>):Boolean{
    if (liste.contains(element))
    {

        println("$element est trouver dans la liste")
        return true

    }
    return false
}

fun compte(element: Int,liste: List<Int>):Int{
    var result=0;
  liste.forEach {items->
      if (items==element){
          result++
      }

  }
    println(result)
   return result
}