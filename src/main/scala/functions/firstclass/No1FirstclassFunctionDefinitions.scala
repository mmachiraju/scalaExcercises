package functions.firstclass

/**
 * Created by mmachiraju on 21/01/2016.
 */
object No1FirstclassFunctionDefinitions extends App {


  //not a first class function,
  def nonFirstClassFunction(a: Int) = {
    a * 2
  }

  def nonFirstClassFunctionDouble(a: Int): Double = {
    a * 2
  }

  def wildCardFirstclass(a: Int): Double = {
    println("Wild Card")
    a * 2
  }

  def greet (a:Int): String = "Manogna"
  println(greet(1))

  //  The type of a function is a simple grouping of its input types
//  and return value type, arranged with an arrow indicating the direction from input types to output type.
  //this is a first class function which has its type and a return type explicitly defined.as observed it is a val/var rather than def
  //because technically its not a def
  val assignedDouble: (Int) => Int = nonFirstClassFunction
  println(assignedDouble(5))
//  This is not possible,to assign a function definition to a value with out defining the type
//  as we need to differentiate the function call from calling the function returned.
//  so HAVE TO DEFINE THE TYPE OF THE FUNCTION Ie,(INT) => INT

//  val assignedDouble1 = nonFirstClassFunction


  //we can not define and declare a first class citizen at the same time.


//USING a wild card _  copies the type of the function in this case (Int) => Int,and so we dont need to define the type again
  val paramsRetainedFunction = nonFirstClassFunction _
  println(paramsRetainedFunction(1))



  val firstClassFunction: Int => Double = nonFirstClassFunctionDouble
  //this is possible
  //we can assign a function defined as a first class citizen with out mentioning the type again.
  var firstClassFunctionCopy = firstClassFunction


  //Scala implicitly infers the type of the assignee
  val copyOfMethod = assignedDouble;
  println(copyOfMethod(5))

  //only first class functions can be assigned to another value and not the traditional defined functions
  //  val copyOfMethodBasic = nonFirstClassFunction;

  //Using *********WildCard***********
  val wildCardCopied = wildCardFirstclass _
  wildCardCopied(4)

}
