

object Q01 extends App {
    def prime(p: Int, n: Int=2): Boolean = n match {
    case x if(p==x) => true
    case x if(gcd(p,x)>1) => false
    case x => prime(p, x+1)
  }
    def gcd(x: Int, y: Int): Int = {
    if(y == 0)
      return x
    return gcd(y, x%y)
  } 

    println(prime(5))
    println(prime(8))
}