

object Q04 extends App {
  def isEvenOrOdd(n: Int): String = n match {
    case 0 => "Even"
    case 1 => "Odd"
    case _ => isEvenOrOdd(n-2)
  }

    println(isEvenOrOdd(536))
    println(isEvenOrOdd(999))
}