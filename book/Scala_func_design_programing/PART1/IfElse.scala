object IfElse{
  def abs(target : Int) : Int = 
    if (target < 0) -target
    else target
  def main(args : Array[String]) : Unit = {
    println(abs(-32))
  }
}
