object TryCatch{
  def errorHappen(): Int={
    throw new Exception("throw")
    0
  }
  def main(args:Array[String]) :Unit={
    try{
      val t = errorHappen()
      println("not error happen")
    }
    catch {
      case _:Exception => println("Error happen")
    }
  }
}
