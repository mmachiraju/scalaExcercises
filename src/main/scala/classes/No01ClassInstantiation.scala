package classes

/**
 * Created by mmachiraju on 17/02/2016.
 */
class ClassInstantiation {

  var name: String = "Manogna"

  def greet: String = {
    println(s"Greet $name")
    s"Greetigs $name"
  }

  override def toString = s"TOString overridden $name"
}

object ClassInstantiation {

  def main(args: Array[String]): Unit = {
    val pt = new ClassInstantiation();
    pt.greet
  }
}