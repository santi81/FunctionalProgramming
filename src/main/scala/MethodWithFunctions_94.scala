
object MethodWithFunctions_94 extends App {


  def exec(callback: (Int) => Unit) : Unit = {
    callback(1)
  }

  val plusOne = (i:Int) => {println(i+1)}

  exec(plusOne)

  val plusTen = (i:Int) => {println(i+10)}

  exec(plusTen)

  //a function that takes a string and returns an Int

  // executeFunction(f:(String) => Int)
  //paranthesis are optional if only one parameter ..hence

  // executeFunction(f:String => Int)

  // A function that takes two Ints and returns a Boolean

  // exectuteFunction(f:(Int,Int) => Boolean)

  def exec2(callback:(Any,Any) => Unit,x: Any, y:Any):Unit = {
    callback(x,y)
  }

  def callbackFunc(x:Any,y:Any): Unit = {

    println(x)
    println(y)
  }

  case class Person(name:String)
  exec2(callbackFunc,"Hello",Person("World"))

}
