package functions

/**
 * Created by mmachiraju on 20/01/2016.
 */
object No10MethodsAndOperators extends App {
  //  method is a function defined in a class
  // and available from any instance of the class
  val s = "vacation.jpg"
  val isJPEG = s.endsWith(".jpg")
  //this is called object notation for better readability replace . with space and () with a space again.

  val isJPEG2 = s endsWith ".jpg"
  println(isJPEG2)

  //here - is not a operator but a method on Double object dec.In scala everything is an object
  val dec: Double = 10.2
  println(dec - 1)


}
