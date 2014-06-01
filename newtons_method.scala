object NewtonMethod {

  def sqrIntr(guess: Double, x: Double): Double =
    if (isGoodEnough(guess: Double, x: Double)) guess
    else sqrIntr(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001
    
  def improve(guess: Double, x: Double) =
    (guess + x/ guess) / 2
  
  def abs(x: Double) = if (x < 0) -x else x
  
  def sqrt(x: Double) = sqrIntr(1.0, x)
  
  def main(args: Array[String]) {
   println(sqrt(2)); 
   
   println(sqrt(1e60))
  }
}