object Exercise{
  def uncurry[A,B,C](f:A=>B=>C):(A,B)=>C={
    (a:A, b:B)=> {
      val g = f(a)
      g(b)
    }
  }
  def main(args:Array[String]):Unit = {
    def f(a:Int):Int = a+1
    def g(c:Int):(Int=>Int)={(b:Int)=>f(b+c)}
    val h = uncurry(g)
    println(h(4,3))
  }
}
