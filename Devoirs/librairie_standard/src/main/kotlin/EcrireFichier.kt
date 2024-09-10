import java.io.File

fun main(args:Array<String>){
    var NomFichier: String = args[0]
    var fichier1: File=File(NomFichier)
    if (fichier1.exists()){
       var text1:String ="Eugene Kerby"
        fichier1.writeText(text1)
        println(text1)
    }

}