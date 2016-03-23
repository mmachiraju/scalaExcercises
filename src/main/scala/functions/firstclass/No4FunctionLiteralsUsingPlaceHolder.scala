package functions.firstclass

/**
 * Created by mmachiraju on 21/01/2016.
 */
object No4FunctionLiteralsUsingPlaceHolder extends App {
  /*
  Placeholder syntax is a shortened form of function literals,
  replacing named parameters with wildcard operators (_).
  It can be used when (a) the explicit type of the function is specified outside the literal and
  (b) the parameters are used no more than once.

  */
  val doubleS: (Int) => Int = _ * 2;

  //Number of place holders should Match number of the params

  //the below is not valid for obvious reasons.
    val double2Params : (Int,Int)=>Int = _+2*_;
  println(double2Params(3,2))
  println(double2Params(2,3))


}