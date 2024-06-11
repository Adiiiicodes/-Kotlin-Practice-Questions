fun main() {
    println("Enter a number to calculate its Factorial")
    var n = readLine()?.toIntOrNull()

    if (n != null) {
        var fac = 1

        for (i in 1..n) {
            fac *= i
        }
        println("Factorial is $fac")

    } else {
        println("Invalid input")
    }
}
