object Exercise{
  def compose[A,B,C](f:B=>C, g:A=>B):A=>C ={
    (a:A) => f(g(a))
  }
  def main(args: Array[String]) :Unit={
    def f(a:Int):Boolean=a%2==0
    def g(a:Boolean):Int={
      if(a == true)1
      else 0
    }
    val composeFunc = compose(g,f)
    println(composeFunc(2))
  }
}

