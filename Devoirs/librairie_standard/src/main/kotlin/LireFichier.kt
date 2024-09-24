import java.io.File

fun main(args: Array<String>) {
    var nomFichier1: String = args[0]
    var nomFichier2: String = args[1]
    var fichier1: File = File(nomFichier1)
    if (fichier1.exists()) {
        var texte1: String = fichier1.readText()
        println(texte1)
        var list1: List<String> = texte1.split("\n")
        println(list1)

        var texte2: String =list1.joinToString("--------")
        println(texte2)
    } else {
        println("Le fichier exist pas")
    }
}
