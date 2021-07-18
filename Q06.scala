

object Q06 extends App {
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-2)+fib(n-1)
  }

  def fibSeries(n: Int): Unit = {
    if(n>=0){
      fibSeries(n-1)
      print(fib(n)+" ")
    }
  }
  
  fibSeries(9)
  println()
}