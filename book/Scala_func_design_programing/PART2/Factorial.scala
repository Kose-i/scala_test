object Factorial{
  def factorial(n : Int): Int = {

    def go(n: Int, acc: Int) : Int =
      if (n <= 0) acc // acc is multiple from 1 to n
      else go(n - 1, n*acc) // n*acc is (n-1)*n*...target_num

    go(n, 1) // call go function
  }
  def main(args: Array[String]): Unit =
    println(factorial(4))
}
