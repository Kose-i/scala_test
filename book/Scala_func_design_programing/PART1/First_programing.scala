
object FirstPrograming{
  def abs(target: Int): Int = 
    if (target > 0) target
    else  -target
  def main(args: Array[String]) : Unit = {
    val x = new StringBuilder("Hello, World")
    val y = x.append(", world")
    println(y.toString)
  }
}
