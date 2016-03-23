package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No7PracticeProcedures extends App {

  //Functions with no return type is a Procedure in Scala
  //Of type Unit is equivalent to VOID and is optional
  def noRetFunc(str: String): Unit = {
    print(str)
  }

  noRetFunc("MM")

  //If last statement is not a value,scala assumes it to be void type
  def noretFunc1(x: Int, y: Int) = {
    x + y
    print(s"$x,$y")
  }

  print(noretFunc1(1, 2))

  //alternative way,though not suggested way of writing procedures is with out Unit return type and with out -
  def proc(x: Int) {
    print(x)
  }

  proc(1)

}

