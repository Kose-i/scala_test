object Exercise{
  def fib(n: Int): Int ={
    def go(n : Int) :Int= 
      if (n == 0) 0
      else if (n == 1) 1
      else go(n - 1) + go(n - 2)
    go(n)
  }
  def main(args: Array[String]) :Unit =
    println(fib(3))
}
