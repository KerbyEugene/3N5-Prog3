

fun triangle(hauteur: Int): String {
    val builder = StringBuilder()
    for (i in 1..hauteur) {
        for (j in 1..i) {
            builder.append('*')
        }
        builder.append('\n')
    }
    return builder.toString()
}

fun main() {
    val tailles = listOf(4, 8, 10, 100)

    for (taille in tailles) {
        println(triangle(taille))
        println()
    }
}
