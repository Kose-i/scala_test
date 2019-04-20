object LazyKeyword{
  def funcTest(b: Boolean, i: => Int): Int = if (b) i+i else 0
  def main(args: Array[String]) : Unit = {
    //val i = {println("hoge");2+41}
    lazy val i = {println("hoge");2+41}
    println("before val x")
    val x = funcTest(true, i)
    println(x)
  }
}
