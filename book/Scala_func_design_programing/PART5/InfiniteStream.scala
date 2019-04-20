object InfiniteStream {
  val ones: Stream[Int] = Stream.cons(1, ones)
  def main(args: Array[String]): Unit ={
    val t = ones.take(4).toList
    println(t)
    val boolCheck = ones.exists(_ % 2 != 0)
    if (boolCheck == true) println("Exist")
    else println("Not Exist")
  }
}

