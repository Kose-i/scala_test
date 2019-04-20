object ParTest{
  def sum(ints: IndexedSeq[Int]): Int = {
    if (targetSeq.size <= 1) Par.unit(ints.headOption getOrElse 0)
    else {
      val (l, r) = ints.splitAt(ints.length / 2)
      Par.map2(sum(l), sum(r))(_+_)
    }
  }
  def main(args: Array[String]) : Unit = {
    val a = IndexedSeq(1,2,3,1,1,2,5)
    println(sum(a))
  }
}
