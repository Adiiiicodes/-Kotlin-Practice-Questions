fun main() {
    println("Enter a number:")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        val result = when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
        println("The number is $result")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
