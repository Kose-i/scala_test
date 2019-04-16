
object FirstPrograming{
  def main(args: Array[String]) : Unit = {
    val x = new StringBuilder("Hello, World")
    val y = x.append(", world")
    println(y.toString)
  }
}
