package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No9FunctionsWithParameterGroups extends App {
  //Scala provides the option to break these
  // into groups of parameters, each separated with their own parentheses.
  def max(x: Int, y: Int): Int = {
    if (x >= y) x else y
  }
  println("Using the normal function call :: "+ (max(1,2)))


//  THis is not allowed as type erasure is done
//  Error:(14, 7) double definition:
//  def max(x: Int,y: Int): Int at line 9 and
//  def max(x: Int)(y: Int): Int at line 14
//  have same type after erasure: (x: Int, y: Int)Int
//  def max(x: Int)( y: Int): Int = {

//  def max(x: Int)( y: Int): Int = {
//    if (x >= y) x else y
//  }
//  println("Using the normal function call :: "+ (max(1)(2)))

  def maxGroupedParams(x: Int) (y: Int): Int = {
    if (x >= y) x else y
  }
  println("Using the param group function call :: "+ (maxGroupedParams(1)(2)))
}
