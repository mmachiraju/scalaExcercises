package classes

/**
 * Created by mmachiraju on 18/02/2016.
 */
object TestAgain {
  def main(args: Array[String]): Unit = {
    val ptt = new ClassInstantiation();
    ptt.greet

    val varaibleInstance = new No02CompanionObject();
    println(varaibleInstance.variable1)
    println(varaibleInstance.variable2)
    //This is not possible as variable3 is a private variable and TestAgain is not a companion object
    //    println(varaibleInstance.variable3)
  }
}
