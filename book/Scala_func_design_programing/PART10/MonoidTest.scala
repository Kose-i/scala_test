trait Monoid[A] {
  def op(a1: A, a2: A): A
  def zero: A
}


object MonoidTest{
  val stringMonoid = new Monoid[String] {
    def op(a1: String, a2: String) = a1 + a2
    val zero = ""
  }
  def main(args: Array[String]) : Unit = {
    val t = stringMonoid
    val p = t.op(t.op("aaa", "bbbbbbb"), "c")
    println(p)
  }
}
