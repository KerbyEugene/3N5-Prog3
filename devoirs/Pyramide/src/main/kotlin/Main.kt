package org.Eugene

fun main(args: Array<String>) {
    if(args.isEmpty()){
        println("aucune hauteur fournie en argument")
    }else
    {
        for (arg:String in args){
            try {
                val hauteur:Int = arg.toInt()
                afficherpyramide(hauteur)
            } catch (e: Exception) {
                println("cette argument nest pas une hauteurs valid: $arg")
            }
        }

    }



}

 fun afficherpyramide(hauteur:Int) {

    var nbetoiles: Int = 1
    var nbespace: Int = hauteur - 1
    var ligne: String = ""
    for (i: Int in 1..hauteur) {
        ligne = " ".repeat(nbespace) + "*".repeat(nbetoiles)
        println(ligne)
        nbetoiles += 2
        nbespace -= 1
    }
}