package functions

/**
 * Created by mmachiraju on 19/01/2016.
 */
object No4PraticeNestedFunctions extends App {
  /*
  There are times when you have logic that needs to be repeated inside a method,
  but would not benefit from being extrapolated to an external method.
  In these cases defining an internal function inside another function, to only be used in that function, may be worthwhile.
   */
  def findMaxOf3(x: Int, y: Int, z: Int): Int = {
    def maxOf2(xx: Int, yy: Int): Int = {
      return if (xx >= yy) xx else yy;
    }
    maxOf2(maxOf2(x, y),z);

  }
  print(findMaxOf3(1,2,3))
}
