import kotlin.random.Random

fun main(){
    println("allo")
   createTable(4)
    average(4)
}

private fun createTable(n:Int): Array<Int> {

    var array = Array<Int>(n){Random.nextInt(0, 100)}
    for(i in array)
    {
        println(i)
    }
    return array
}

private fun average(n: Int) {

    println(createTable(n).average())
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
