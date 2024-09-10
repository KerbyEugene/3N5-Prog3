fun repete(n: Int, nombreFois: Int): List<Int> {
    return (1..n).flatMap { num -> List(nombreFois) { num } }
}

fun main() {
    // Tests avec différentes valeurs
    val result1 = repete(4, 2)
    val result2 = repete(3, 3)
    val result3 = repete(5, 1)
    val result4 = repete(2, 4)


    println(result1)
    println(result2)
    println(result3)
    println(result4) 
}
