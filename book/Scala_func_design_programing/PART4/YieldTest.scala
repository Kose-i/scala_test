object YieldTest{
  def map2[A,B,C](a: Seq[A], b: Seq[B])(f: (A, B) => C): Seq[C] =
    for {
      aa <- a
      bb <- b
    } yield f(aa, bb)

  def main(args: Array[String]) : Unit ={
    val a = Seq(1.0, 2.0)
    val b = Seq(2.0, 3.0)
    val c = map2(a, b) ((x,y)=>x+y)
  }
}
