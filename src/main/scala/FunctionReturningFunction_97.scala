
object FunctionReturningFunction_97 extends App {


  def saySomething(prefix:String) = (s:String) => {

    prefix + " " + s

  }

  val sayHello = saySomething("Hello")

  println(sayHello("Santi"))



  def greeting(language:String) = (name:String) => {

    val english = () => "Hello" + " " + name

    val spanish = () =>  "Hola" + " " + name

    language match {

      case "english" => english()
      case "spanish" => spanish()

    }
  }

  val hello = greeting("english")

  val buenosDias = greeting("spanish")

  println(hello("Santi"))

  println(buenosDias("Santi"))



  def newSaySomething(prefix:String)(s: String) : String = {

    prefix + " " + s
  }

  //another way to define this would be

  def anotherNewSaySomething(prefix : String): (String) => String = {

    def addString(s : String) : String = {

      prefix  + " " + s
    }
    addString
  }

 println(newSaySomething("Hello")("Santosh"))

}
