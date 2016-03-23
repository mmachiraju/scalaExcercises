/**
 * Created by mmachiraju on 13/11/2015.
 */
object UsingMatcherAliasCase extends App{
  val x : Int =10
  val y : Int = 20

  def goldilocks(expr: Any) = expr match {
    case ("porridge", "Papa") => "Papa eating porridge"
    case ("porridge", "Mama") => "Mama eating porridge"
    case ("porridge", "Baby") => "Baby eating porridge"
    case _ => "what?"
  }
val answer = goldilocks(("porridge", "Mama"))
  print(s"Manogna answer is $answer")
  //plain switch statements.
  x==y match{
  case true => println("Case 1")
  case false => println("Case 2")
  }

  //case that returns a statement
  val result = x match{
   case 10 => "x is 10"
   case 20 => "x is 20"

 }
  println(result)

  //using pattern
  var day = "TUE"
  //val describeTheDay = caseToDescribeDay(day)
  var describeTheDay =  day match {
    //first match is picked
    case "MON" | "TUE" => "Today is a weekday first 2"
    case "WED" | "TUE" => "Today is a weekday next 2"

  }

  println(describeTheDay)

  // scala.MatchError: FRI (of class java.lang.String)
  day = "FRI"
  describeTheDay =  day match {
    //first match is picked
    case "MON" | "TUE" => "Today is a weekday first 2"
    case "WED" | "TUE" => "Today is a weekday next 2"
      //wild card character _
    case _  => "Who cares"
      //or use others
    case others  => "Who cares others"
  }

  println(describeTheDay)
//pattern Guarding.
  var str = "Issue Management"
  patternGuarding(str)
  str = null
  patternGuarding(str)



  def patternGuarding(str : String): Unit = {
    str match {
      case "Issue Management" if str!=null => println(s"No its not empty,its of length '${str.length}'")
        case _ => println("It seems to be null or of length 0")
    }
  }


  //MATCHING TYPES WITH PATTERN VARIABLES
  val abc: Int = 12180
  val ijk: AnyVal = abc

  ijk match{
    case abc : Int => println("input is an integer")
  }

}
