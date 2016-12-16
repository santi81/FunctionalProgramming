
object FunctionsAsVariables_92 extends App {

  val double = (i:Int) => i * 2

  val list = List.range(1, 10)
  val doubledList = list.map(double)

  println(doubledList)


  //implicit approach
  val f = (i:Int) => i %2 == 0


  //explict approach
  val f1 : (Int) => Boolean = i => i %2 == 0


  //implicit approach
  val add = (x:Int, y:Int) => x + y

  //explicit approach
  val add_f1 : (Int, Int) => Int = (x,y) => x+ y


  //Using a method like anonymous function

  def modMethod(i: Int):Boolean  =
  {
    i % 2 == 0
  }

  val evens = list.filter(modMethod)

  println(evens)

  val modMethod_f1:(Int) => Boolean = i => i % 2 == 0

  val evens_f1 = list.filter(modMethod_f1)

  println(evens_f1)

  val modMethod_f2 = (i:Int) => i %2 == 0

  val evens_f2 = list.filter(modMethod_f2)

  println(evens_f2)


  // Adding an existing method or function to a function variable
  // Pre-cursor to partially applied functions
  val c = scala.math.cos _
  println(c)

  println(c(0))

  val p = scala.math.pow(_, _)

  println(p)




}
