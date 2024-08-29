
fun main(List:Array<String>){

    for(arg:String in List) {
      val hauteur=arg.toInt()
        afficherpyramide(hauteur)
    }
}

private fun afficherpyramide(hauteur:Int) {
    var nbetoile = 1
    var nbespace = hauteur - 1
    var ligne = ""
    for (i: Int in 1..hauteur) {
        ligne = " ".repeat(nbespace) + "*".repeat(nbetoile)
        println(ligne)
        nbetoile += 2
        nbespace -= 1
    }
}