object Exercise{
  def curry[A,B,C](f:(A,B)=>C):A=>(B=>C) =
    (a: A) => ((b:B)=>f(a,b))
  def main(args:Array[String]) :Unit = {
    val a = 3
    val b = 34
    val g = curry((a:Int, b:Int)=>a+b)
    val h = g(a)
    println(h(b))
  }
}
