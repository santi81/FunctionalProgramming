

object PartiallyAppliedFunctions_96 extends App {

  //In a functional programming language when you call a function that has parameters, you are said to be applying
  //function to the parameters.When all the parameters are passed to the function ...you have fully applied the function
  // to all the parameter.But when you give only a subset of the parameters to the function,the result of the function
  // is a partially applied function.

  // A partially applied function is a variable that you can pass around.

  val sum = (a:Int, b:Int, c:Int) => a + b + c

  val f = sum(1,2,_ :Int)
  println(f(3))

  def wrap(prefix:String, html:String, suffix: String) = {

    prefix + html + suffix
  }

  val wrapWithDiv = wrap("<div>",_:String,"</div>")

  println(wrapWithDiv("<p> Hello World</p>"))

}
