///**
// * Created by mmachiraju on 01/03/2016.
// */
//object ImplicitParameters extends App {
//
//  def multiply(implicit by: Int, value: Int) = {
//    value * by
//  }
////  def example3(x: Int,implicit y: Int) = {}
//def example3(x: Int)( implicit y: Int) = {
//
//}
//  def add(implicit by: Int) = {
//    10 + by
//  }
//
//  //if there are more than one implicit variable defined for the same type that matches with
//  //  the implicit parameter type of the method,there would be a run time exception when we invoke the method.
//  implicit val multiplier: Int = 10;
//    implicit val multiplier1 : Int = 20;
//
//  //in this case
//  println(multiply)
////  println(add())
//  println(multiply(2, 10))
//
//}
