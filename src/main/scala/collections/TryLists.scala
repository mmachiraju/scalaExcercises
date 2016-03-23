package collections

/**
 * Created by mmachiraju on 22/03/2016.
 */
object TryLists extends App{

//  def foldLeft[B](z: B)(f: (B, A) => B): B
  //Reduces the list given a starting value and a reduction function.reduction function. ==> 25

//  For example, say we had a list of Ints 1, 2, and 3. We could call foldLeft(“X”)((b,a) => b + a). For the first item, 1, the function we define would add string “X” to Int 1, returning string “X1”. For the second list item, 2, the function would add string “X1” to Int 2, returning “X12”. And for the final list item, 3, the function would add “X12” to 3 and return “X123”.


  println(List(4, 5, 6).fold(10)(_ % _))

  println(List(4, 5, 6).foldLeft(10)(_ +_))
}
