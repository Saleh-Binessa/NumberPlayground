fun countUpwards(start: Int, end: Int) {
    println("Counting Upwards:")
    for (i in start..end) {
        print("$i ")
    }
    println()
}

fun countDownwards(end: Int, start: Int) {
    println("Counting Downwards:")
    var current = end
    while (current >= start) {
        print("$current ")
        current--
    }
    println()
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun checkEvenOdd(number: Int) {
    println("Even or Odd Numbers up to $number:")
    for (i in 1..number) {
        if (i % 2 == 0) {
            println("$i is even")
        } else {
            println("$i is odd")
        }
    }
}

fun calculateFactorial(number: Int): Long {
    var factorial: Long = 1
    for (i in 1..number) {
        factorial *= i.toLong()
    }
    return factorial
}

fun main() {
    countUpwards(1, 6)
    countDownwards(6, 1)

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val sum = calculateSum(numbers)
    println("Sum of numbers: $sum")

    checkEvenOdd(10)

    val factorialResult = calculateFactorial(6)
    println("Factorial of 6: $factorialResult")
}