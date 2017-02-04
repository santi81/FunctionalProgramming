
abstract class IntSets{
  def incl(x:Int): IntSets
  def contains(x:Int): Boolean
}
class NonEmpty(elem:Int,left:IntSets,right:IntSets) extends IntSets{
  def contains(x:Int) : Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }
  def incl(x:Int): IntSets = {
    if (x < elem ) new NonEmpty(elem, left incl x,right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  override def toString = "{" + left + elem + right + "}"
}
object Empty extends IntSets{
  def incl(x:Int) = new NonEmpty(x,Empty,Empty)
  def contains(x:Int) = false
  override def toString = "."
}

def error(msg:String ) = throw new Error(msg)

  println("Welcome to Scala Worksheet")
  val t1 = new NonEmpty(3,Empty,Empty)
  val t2 = t1 incl 4
  println(t2)

error("Hmmm")
