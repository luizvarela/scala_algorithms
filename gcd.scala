object Gcd {

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def main(args: Array[String]) {
    gcd(14, 21)
  }
}