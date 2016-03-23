/**
 * Created by mmachiraju on 23/01/2016.
 */
object FunctionCurrying extends App {

  def factorOf (x:Int)(y:Int): Boolean = x % y == 0;

  var isEven: Boolean = factorOf(10)(2)

  println(s"It is a Even : $isEven")

  isEven = factorOf(13)(2)
  println(s"It is a Even : $isEven")

  //Currying of functions or parially applying functions

 // val isEvenFunction = factorOf(2)(_)
 // val isEvenFunction1 = factorOf(_)(2)
 // val newEvenBool: Boolean = isEvenFunction(10)

  //println(s"It is a Even : $newEvenBool")
}
