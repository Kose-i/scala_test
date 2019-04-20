sealed trait Either[+E, +A]
case class Left[+E](value: E) extends Either[E,Nothing]
case class Right[+A](value: A) extends Either[Nothing, A]

object EitherTest{
  def mean(xs: IndexedSeq[Double]): Either[String, Double] =
    if (xs.isEmpty) Left("mean of empty list")
    else Right(xs.sum / xs.length)

  def main(args : Array[String]): Unit = {
    val tmp = IndexedSeq(1.2, 2.3, 3.1)
    val ans = mean(tmp)
    try println(Right(ans))
    catch {case e: Exception => Left(ans)}
  }
}
