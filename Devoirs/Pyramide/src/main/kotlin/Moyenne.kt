import kotlin.random.Random

fun main(n:Int):Array<String>{
    return createTable()


}

private fun createTable(): Array<Int> {
    var array = Array<Int>(100){}
    return array
}

private fun average() {
    val randomValue = Array(10) { Random.nextInt(0, 100) }
    println(randomValue)
    println(randomValue.average())
}

private fun Max() {
    val randomValue = Array(10) { Random.nextInt(0, 100) }
    println(randomValue)
    println(randomValue.max())
}

private fun Min() {
    val randomValue = Array(10) { Random.nextInt(0, 100) }
    println(randomValue)
    println(randomValue.min())
}

private fun ListeDeChiffreHasardSum() {
    val randomValue = Array(10) { Random.nextInt(0, 100) }
   println(randomValue)
    println(randomValue.sum())
}
