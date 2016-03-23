package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No5PracticeVarargsAsParams extends App {
  //  To mark a function parameter as matching one or more input arguments,
  // add an asterisk symbol (*) after the parameter’s type in the function definition

  def funcWithVarargs(items: Int*): Int = {
    var sum: Int = 0;
    for (t <- items) {
      sum += t;
    }
    sum;
  }
  println(funcWithVarargs(1,2,3,4))
  println(funcWithVarargs(1,2,3))

}
