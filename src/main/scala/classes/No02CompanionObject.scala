package classes

/**
 * Created by mmachiraju on 18/02/2016.
 */
class No02CompanionObject(var variable1: Int = 0, var variable2: Int = 0, private var variable3: Int = -1) {
  def sum: Int = {
    variable1 + variable2;
  }
}

object No02CompanionObject extends App {
  val classInstance = new No02CompanionObject(10, 20)
  println(classInstance.sum)
  //private variable in companion class is accesible by companion object
  println(classInstance.variable3)
}
