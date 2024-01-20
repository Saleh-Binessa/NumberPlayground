fun repeatUntilZero() {
    var userInput: Int
    do {
        println("Enter a number (0 to exit): ")
        userInput = readLine()?.toInt() ?: 0
        println("You entered: $userInput")
    } while (userInput != 0)
}
fun main() {
    repeatUntilZero()
}