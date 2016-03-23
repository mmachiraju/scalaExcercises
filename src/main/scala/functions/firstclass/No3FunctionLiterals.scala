package functions.firstclass

/**
 * Created by mmachiraju on 21/01/2016.
 */
object No3FunctionLiterals extends App {


  // function literals are nameless functions,the right side of it is the function definition
  //NOT POSSIBLE TO DEFINE THE RETURN TYPE FOR THE FUNCTION IN FUNCTIONAL LITERALS,AND IS IMPLIED.
  //function literal is essentially a parameterized expression
  val doublerLiteral = (inputValue: Int) => inputValue * 2
  val doubler: (Int) => Int = doublerLiteral
  val maximizeFnLiteral = (a: Int, b: Int) => if (a > b) a else b

  def higherOrderFnWhichExpectsFunction(a: Int, b: Int, printFunction: (Int, Int) => Unit) = {
    println("In Higher Order function")
    if (a > 0 && b > 0) {
      printFunction(a, b)
    }
  }

  println("Using higherOrderFnWhichExpectsFunction : " +
    higherOrderFnWhichExpectsFunction(1, 2, (a: Int, b: Int) => println(s"using function literal ::$a and $b")))
  println("Using maximizeFnLiteral : " + maximizeFnLiteral(1, 2))
  println("Using Literal Call: " + doublerLiteral(2))
  println("Using Literal assigned variable : " + doubler(2))


  //defining literal with explicit type
  val functionDefinedAsVariableUsingLiteral: (Int) => Int = (a:Int)=> a
  println(functionDefinedAsVariableUsingLiteral(10000))
  //defining function with out explicity definition
  val funcWithOneVariableLiteral = (a: String) => println(s"Input is $a")
  funcWithOneVariableLiteral("Manogna")


}