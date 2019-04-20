object TwiceTest{
  def funcTest(b: Boolean, i: => Int): Int = if (b) i+i else 0
  def main(args: Array[String]) : Unit = {
    val x = funcTest(true, {println("hoge");2+41})
  }
}
