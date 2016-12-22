
object CreatingPartialFunctions_98 extends App{

  val divide = (x:Int) => 42 / x

  try{
  divide(0)}
  catch{
    case ex:java.lang.ArithmeticException => println("This is the basic purpose of Partial Functions")

  }

  // A partial function is a function that does not provide an answer for every possible input value it can be given
  // It provides answer for only a subset of possible data and defines the data that it can handle.


  val dividePF = new PartialFunction[Int,Int] {

    def apply(x:Int) = 42/x

    def isDefinedAt(x:Int) = x!=0

  }

  if (dividePF.isDefinedAt(0)) dividePF(0) else println("Cannot divide by Zero")



  // Partial Functions can also be written using case Statements

  val divide2: PartialFunction[Int,Int] = {

    case d:Int if d!=0 => 42/d

  }

  println(divide2.isDefinedAt(0))
  println(divide2.isDefinedAt(1))

  // A partial Function of type PartialFunction[Int,Int] is a unary function where the domain does not necessarily
  // include all values of type A.The function isDefinedAt allows to dynamically test if a value is in the domain
  // of the function

  // Signature of Partial Function trait looks like this

  // trait PartialFunction[-A,+B] extends (A) => B

  val convertLowNumToString = new PartialFunction[Int,Unit] {

    def apply(x:Int) = println(x.toString)

    def isDefinedAt(x:Int) = x < 6

  }

  if(convertLowNumToString.isDefinedAt(5)) convertLowNumToString(5)


  //orElse and Then .

  //Partial Function allows method chaining...

  val convert1to5 = new PartialFunction[Int,Unit] {

    def isDefinedAt(x:Int) = x < 6

    def apply(x:Int) = println(x.toString)
  }


  val convert6to10 = new PartialFunction[Int,Unit] {

    def isDefinedAt(x:Int) = x > 6 && x < 11

    def apply(x:Int) = println(s"Shit it chose this ${x.toString}")
  }

  val convert1to10 = convert1to5 orElse convert6to10

  convert1to10(10)

  convert1to10(20)


  // List(0,1,2) map dividePF

  List(0,1,2).collect(dividePF).foreach(println)


  // A case class is an example of a Partial Function

  List(0,1,2) collect {

    case i:Int if i!=0 => println(i)


  }


}
