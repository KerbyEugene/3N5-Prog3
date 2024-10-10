package crawly.eugene

fun main() {
    var question: String="Veuillez entrer un nombre :"
    while (true){
        println(question)
        var reponse:String= readln()
        if (reponse=="123")
        {
            println("Merci, votre nombre est 123.")
            return
        }
        else{
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
    }
}