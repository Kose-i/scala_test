import Gen._

object TestCode{
  def main(args: Array[String]) : Unit = {
    val intList = Gen.listOf(Gen.choose(0,100))
    println(intList)
  }
}
