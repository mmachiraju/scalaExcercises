package functions.firstclass

/**
 * Created by mmachiraju on 21/01/2016.
 */
object No5ByNameParameter extends App {
  def nano() = {
    println("Getting nano")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    // => indicates a by-name parameter
    println("In delayed method")
    println("Param: " + t)
    t
  }

  // argument is not evaluated at the point of function application, but instead is evaluated at each use within the function.

  println(delayed(nano()))


  //  https://tpolecat.github.io/2014/06/26/call-by-name.html
  //  A common question on #scala is, what's the difference between a parameter of type A and one of type => A
  //normal definition of a parameter of type A acts like a val
  def when[A](condition: Boolean, whenTrue: A, whenFalse: A): A = {
    condition match {
      case true => whenTrue
      case false => whenFalse
    }
  }

  println(when(1 == 1, "foo", "bar"))
  println(when(1 == 2, "foo", "bar"))
  //println is evaluated in both cases,pass a function
  println(when(1 == 1, println("foo"), println("bar")))

  def when1[A](condition: Boolean, whenTrue: => A, whenFalse: => A): A = {
    condition match {
      case true => whenTrue
      case false => whenFalse
    }
  }

  println("When1" + when1(1 == 1, "foo", "bar"))
  println("When1" + when1(1 == 2, "foo", "bar"))
  //println is evaluated in only in according cases,again gets back to the original
  //statement  argument is not evaluated at the point of function application,
  // but instead is evaluated at each use within the function.
  println("When1" + when1(1 == 1, println("foo"), println("bar")))
  println("When1" + when1(1 == 2, println("foo"), println("bar")))





}