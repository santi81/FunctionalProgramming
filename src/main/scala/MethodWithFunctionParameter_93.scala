
object MethodWithFunctionParameter_93 extends App {

  def executeFunction(callback:() => Unit){

    callback()
  }

  val sayHello = () => println("Hello World")

  executeFunction(sayHello)

  //general syntax
  // parameterName:(parameterType(s)) => returnType

}
