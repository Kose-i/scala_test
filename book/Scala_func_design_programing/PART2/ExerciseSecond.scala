object ExerciseSecond{
  def isSorted[A](as: Array[A], ordered: (A,A)=>Boolean): Boolean ={
    def loop(n:Int) : Boolean={
      if (as.length == n + 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false
    }
    loop(0)
  }

  def main(args: Array[String]) : Unit = {
    val sortedTarget = Array(1,2,2,1)
    if (isSorted(sortedTarget, (a:Int, b:Int) => a<b)) println("sorted")
    else println("Not sorted")
  }
}
