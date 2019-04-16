object FindFirst{
  def findFirst[A](ss: Array[A], p: A => Boolean) : Int = {
    @annotation.tailrec
    def loop(n : Int) : Int =
      if (n >= ss.length) -1
      else if (p(ss(n)) ) n
      else loop(n + 1)
    loop(0)
  }
  def main(args: Array[String]) : Unit = {
    val tmp = Array("ai", "ue", "o")
    val num = findFirst(tmp, (x: String)=>x.length == 1)
    println(num)
  }
}
