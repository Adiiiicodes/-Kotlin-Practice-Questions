fun main() {
    var a=5
    var b=9
    var c=7

     largestofthree(a,b,c)
}

fun largestofthree(a: Int , b:Int , c : Int) {

    if(a>b || a>c) {
        println(" $a is the greatest")
    }
         else if (b>c || b>c) {
            println("$b is the greatest")
        } else {
            println("$c is the greatest")
        }
    }
