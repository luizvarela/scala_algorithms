object Factorial {
  
  def factorial(number: Int): Int =
    if(number == 0) 1 else number * factorial(number - 1) 

  def main(args: Array[String]) {
    factorial(4)
  }  
}