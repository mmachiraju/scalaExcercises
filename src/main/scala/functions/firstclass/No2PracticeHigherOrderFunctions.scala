package functions.firstclass

/**
 * Created by mmachiraju on 21/01/2016.
 */
object No2PracticeHigherOrderFunctions extends App {
  //Higher Order Functions are functions which accept functions as parameters
  def HigherOrderFunction(s: String, greet: String => String) = {
    println(s"The input string is $s")
    val greetingMessage = greet(s)
    println(greetingMessage)

  }

  def greetingMessage(s: String): String = {
    s"Hello,$s"
  }

  def greetingMessageFormat1(s: String): String = {
    s"Hello,$s I am so bored of doing this"
  }

  val functionType: (String) => String = greetingMessage
  val functionType1: (String) => String = greetingMessageFormat1
  val testStr: String = "Test String"

  def funcReverser(s: String): String = testStr.reverse
  //this doesnt work obviously
//  def funcTest(i:Int):Int = greetingMessage

  HigherOrderFunction("Manogna", functionType)
  HigherOrderFunction("Manogna", greetingMessage)

  HigherOrderFunction("Manogna", functionType1)
  HigherOrderFunction("Manogna", greetingMessageFormat1)

  HigherOrderFunction("Manogna", funcReverser);

//  HigherOrderFunction("Manogna", testStr.reverse)
}
