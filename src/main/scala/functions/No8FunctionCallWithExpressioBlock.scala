package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No8FunctionCallWithExpressioBlock extends App {

  def fun1 = "Hi";
  println(fun1)

  //define return type as String using :<type> after function syntax
  def fun2: String = "Hello";
  println(fun2)

  def add(x: Int, y: Int): Int = {
    //last line is the default return value of the function.If explicitly can use keyword return
    x + y
  }

  println(add(1, 2))
  //  println(add(1,"MM"))

  //use curly braces to send an evaluated value to function
  def formatEuro(amt: Double) = f"€$amt%.2f"
  formatEuro { val rate = 1.32; 0.235 + 0.7123 + rate * 5.32 }

}
