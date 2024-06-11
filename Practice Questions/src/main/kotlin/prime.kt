fun main() {
    var i = 0
    println("Enter a number")

    var n = readLine()?.toIntOrNull()

    if (n != null) {
        var isPrime = true // Variable to track if the number is prime

        for (i in 2 until n) { // Iterate from 2 up to n - 1
            if (n % i == 0) { // If n is divisible by any number in this range, it's not prime
                isPrime = false
                break // Exit the loop early
            }
        }

        // Check the value of isPrime to print the result
        if (isPrime) {
            println("It is a prime number")
        } else {
            println("It is not a prime number")
        }

    } else println("Invalid")
}
