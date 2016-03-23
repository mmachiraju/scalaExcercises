/**
 * Created by mmachiraju on 13/11/2015.
 */
object HelloWorldUsingTrait extends App{
  val x : Int =10
  val y : Int = 10

  x==y match{
  case true => println("Case 1")
  case false => println("Case 2")
  }

}
