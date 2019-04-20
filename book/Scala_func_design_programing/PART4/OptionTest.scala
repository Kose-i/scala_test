sealed trait Option[+A]
case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]

object OptionTest{
  def mean(xs: Seq[Double]): Option[Double] =
    if (xs.isEmpty)None
    else Some(xs.sum/ xs.length)

  def main(args: Array[String]) : Unit = {
    //val tmp = Seq(2.0,3.1,4.4)
    val tmp = Seq()
    val ans = mean(tmp)

    if (ans == None) println("None")
    else println(ans)
  }
}
