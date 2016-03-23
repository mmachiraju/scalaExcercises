package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object FizzBuzz extends App {
  //a function with no input params can define () when defining.
  def fizzFunc(input : Int) : String = {
    if(input%3 ==0 )
    "Fizz"
    else
      ""
  }
  def buzzFunc(input : Int) : String = {
    if(input%5 ==0 )
      "Buzz"
    else
      ""
  }

  //Using Tuples
  def fizzbuzzFunc(input : Int) : String = {
    (input%3,input%5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
    }

  }

 def printFizzBuzz(input : Int,fizz : Int => String,buzz :  Int => String): Unit ={
    println(fizz(input)+buzz(input))
  }
  printFizzBuzz(10,fizzFunc,buzzFunc)
  printFizzBuzz(15,fizzFunc,buzzFunc)
  printFizzBuzz(27,fizzFunc,buzzFunc)
  println("="*10)
  println(fizzbuzzFunc(27))
  println(fizzbuzzFunc(15))
  println(fizzbuzzFunc(10))


}
