/**
 * Created by mmachiraju on 13/11/2015.
 */
object PracticeNestedLoops extends App{
  //Nested Loop
  for (x <- 1 to 5;y <- 1 to 5) {println(s"($x,$y)")}

  //Using Value Binding
  val squaredNumbers = for(x <- 1 to 5; pow = x*x) yield pow
  println(squaredNumbers)


}
