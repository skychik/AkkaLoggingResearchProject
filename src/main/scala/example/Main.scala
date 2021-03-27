package example

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")

  def fac(n: Int): Int = if (n == 0) 1 else n * fac(n - 1)

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
}
