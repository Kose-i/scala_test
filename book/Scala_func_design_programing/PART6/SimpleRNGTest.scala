trait RNG  {
  def nextInt: (Int, RNG)
}

case class SimpleRNG(seed: Long) extends RNG {
  def nextInt: (Int, RNG) = {
    val newSeed = (seed*0x5DEECE66DL  + 0xBL) & 0xFFFFFFFFFFFFL
    val nextRNG = SimpleRNG(newSeed)
    val n = (newSeed >>> 16).toInt
    (n, nextRNG)
  }
}

object SimpleRNGTest{
  def main(args: Array[String]) :Unit={
    val rng = SimpleRNG(42)//initialize

    val (n1, rng1) = rng.nextInt
    println(n1)
    val (n2, rng2) = rng1.nextInt
    println(n2)
    val (n3, rng3) = rng2.nextInt
    println(n3)
  }
}
