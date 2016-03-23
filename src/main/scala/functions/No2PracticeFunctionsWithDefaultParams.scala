package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No2PracticeFunctionsWithDefaultParams extends App {
  //To circumvent the overloaded methods passing in default values to
  //the actual method,scala supports default values for parameters

  def greet(prefix: String = "Anonymous", name: String) = s"$prefix $name"

  println(greet(name = "MM"))

  //if the first ones are normal params,and
  // the last ones have default,we can call the function with out named parameters
  def greet1(prefix: String, name: String = "Anonymous") = s"$prefix $name"

  print(greet1("MM"))

}
