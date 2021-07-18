

object Q05 extends App {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case 1 => false
    case _ => isEven(n-2)
  }

  def sumOfEven(n: Int): Int = n-1 match {
    case x if(x<=0) => 0
    case x if(isEven(x))=> x+sumOfEven(x-1)
    case x => sumOfEven(x)
  }

    println(sumOfEven(5))
    println(sumOfEven(15))
}