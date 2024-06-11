fun main() {
  var a =6
  var b =7

 val result =swap(a,b)
  println("a : ${result.first}, b: ${result.second}")
}
// function to swap numbers
fun swap( a : Int ,b: Int ): Pair<Int, Int> {
  var tempa = a
  var tempb = b
  tempa=tempa+tempb
  tempb=tempa-tempb
  tempa=tempa-tempb

return Pair (tempa ,tempb)
}