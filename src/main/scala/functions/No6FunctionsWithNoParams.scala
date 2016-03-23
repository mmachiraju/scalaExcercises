package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No6FunctionsWithNoParams extends App {
  //a function with no input params can define () when defining.
  def func() = {
    println("Prints to console")
  }

  func()
  //Also can be called wth out () in the invocation
  func;

  //Also function declaration doesnt need () sometimes.
  def fun1 = {
    println("No input params with optional braces")
  }

  def fun2 : String = {
    println("No input params with optional braces")
    "Manogna"
  }

  fun1
  print(fun2)
  //in the above case if function is declared with out braces,we can not call the function with braces,i.e
  //  fun1() leads to compile failure,this is to avoid original function call and calling the function returned by the function.


  //SCALA CONVENTION
  //  FUNCTIONS WITH SIDE EFFECTS SHOULD USE PARENTHESES
  //  A Scala convention for input - less functions is that they should be defined
  // with empty parentheses if they have side effects
  // (i.e., if the function modifies data outside its scope).
  // For example, an input -less function that writes a message to the console should be defined with empty parentheses.
}
