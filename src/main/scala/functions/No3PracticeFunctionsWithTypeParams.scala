package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No3PracticeFunctionsWithTypeParams extends App {
  def identity[A](a: A): A = a

  def paramTypFunc[A, B, C](a: A, b: B, c: C): Unit = {
    print("what the")
  }
  print(identity(1))
  paramTypFunc[Int,Int,Int](1,2,3)
  //scala uses type inference,to identify the params instead of we explicitly mentioning
  println(paramTypFunc(1, 2, 3))

}
