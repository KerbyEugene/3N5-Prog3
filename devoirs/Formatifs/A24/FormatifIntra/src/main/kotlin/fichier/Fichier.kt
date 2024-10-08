package fichier

import java.io.File

fun main() {
    // Tu peux tester tes fonctions en les appellants ici.
    lire()
    val args = arrayOf("pipo.txt", "Bonne Chance Pour Ton Examen :)")
    ecrire(args)
}

/**
 * (1 point) Affiche dans la console le contenu du fichier message.txt qui se trouve dans le projet de départ.
 */
fun lire() {
var File=File("message.txt")
    if (File.exists()){
        var Text: String=File.readText()
        println(Text)
    }
}

/**
 * (1 point) S’il n’y a pas 2 éléments dans le paramètre args, affiche un message d'erreur, et retourne la valeur -1.
 * (1 point) Crée un fichier dans le répertoire du projet, dont le nom sera déterminé par le premier argument.
 *           Par exemple, si l’argument est « pipo.txt » l’application crée le fichier dans le dossier du projet avec le
 *           nom « pipo.txt ».
 * (1 point) Le fichier aura comme contenu le texte contenu dans le 2ème élément qui est dans le paramètre args.
 * Si tout s'est bien passé, on retourne la valeur 1.
 */
fun ecrire(args: Array<String>): Int {
    if (args.size!=2){
        println("erreur")
        return -1
    }
    var NomFichier:String =args[0]
    var Fichier1:File=File(NomFichier)
    val contenu= args[1]
    Fichier1.writeText(contenu)
    var text =Fichier1.readText()
    println(text)
    return 1
}