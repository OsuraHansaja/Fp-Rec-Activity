

object Q02 extends App {
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
  def primeSeq(p: Int): Unit = {
    if(p>1) {
      primeSeq(p-1)
      if(prime(p))
        print(p+" ")
    }
  } 

    primeSeq(10)
    println()
}