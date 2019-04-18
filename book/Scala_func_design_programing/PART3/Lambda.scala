object Lambda{
  def f_wrapper(a:Int, b:Int ,f:(Int,Int)=>Int):Int={
    f(a, b)
  }
  def main(args:Array[String]) :Unit={
    val ans = f_wrapper(3,3, _ + _)
    //val ans = f_wrapper(3,3, (x,y)=>x+y)
    println(ans)
  }
}
