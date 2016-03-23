package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No1PractieFunctionWithNamedParameters extends App{
  //in Scala you can call parameters by name, making it possible to specify them out of order
  def greet(prefix: String, name: String) = s"$prefix $name"
  print(greet(name="MM",prefix = "Hello"))
}
