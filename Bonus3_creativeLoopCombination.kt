fun creativeLoopCombination() {
    for (i in 1..6) {
        if (i % 2 == 0) {
            println("Square of $i is: ${calculateSquare(i)}")
        } else {
            println("Cube of $i is: ${calculateCube(i)}")
        }
    }
}
fun calculateSquare(number: Int): Int {
    return number * number
}
fun calculateCube(number: Int): Int {
    return number * number * number
}
fun main() {
    creativeLoopCombination()
}