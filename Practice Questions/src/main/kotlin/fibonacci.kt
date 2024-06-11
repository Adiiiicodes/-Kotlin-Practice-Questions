fun main() { var prev = 0

    var current =1
    println("Enter the number of terms : ")
    val n = readLine()?.toIntOrNull()
    if (n != null) {
        println("0")
        println("1")

        do {
             val next =  prev + current
            prev=current
            current= next
println("$next")

        } while (next <= n)
    } else {
        println("Invalid Input")
    }
}



