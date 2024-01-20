fun multiplicationTable(size: Int) {
    println("Multiplication Table:")
    for (i in 1..size) {
        for (j in 1..size) {
            print("${i * j}\t")
        }
        println()
    }
}
fun main() {
   multiplicationTable(10)
}