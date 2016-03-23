/**
 * Created by mmachiraju on 13/11/2015.
 */
object PracticeLoops extends App{
  //simple for loop using to -> Includes 7
  for (x <- 1 to 7) { println(s"Day $x:") }

  //simple for loop using until excludes 7
  for (x <- 1 until 7) { println(s"Day $x:") }

  //simple for loop using yield
  for(x <- 1 to 7 ) yield {s"Day $x"}

  //Using Iterator Guards
  val threes = for (i <- 1 to 20 if i % 3 == 0) yield i

  //look at it this way for is a method and its parameters are i <- 1 to 10 if i%2==0)
  val evenNumbers = for(i <- 1 to 10 if i%2==0) yield i
  println(evenNumbers)

  val oddNumbers = for{
    i <- 1 to 10
    if i%2!=0
  } yield i
  println(oddNumbers)

  //looping through split iterator
  var commaList :String = "Medidata,US,UK"

  for(eachString <- commaList.split(",")){
    println(eachString)
  }
}
