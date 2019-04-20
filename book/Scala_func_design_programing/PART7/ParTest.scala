object ParTest{
  def map2[A,B,C](a:A, b:B)(f: (A,B)=>C): C={
    f(a,b)
  }
  def sum(ints: IndexedSeq[Int]): Int = {
    if (ints.size <= 1) (ints.headOption getOrElse 0)
    else {
      val (l, r) = ints.splitAt(ints.length / 2)
      map2(sum(l), sum(r))(_+_)
    }
  }
  def main(args: Array[String]) : Unit = {
    val a = IndexedSeq(1,2,3,1,1,2,5)
    println(sum(a))
  }
}
