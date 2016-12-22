
object Closures_95 extends App {
  //Usage of Closures

  // You want to pass a function around like a variable, and while doing so, you want that function to be able to refer
  // to one or more fields that were in the same scope as the function when it was declared

  var hello = "Hello"
  def sayHello(name: String):Unit = {
    println(s"$hello $name")
  }

  val foo = new Foo()
  foo.exec(sayHello,"Santi")
  hello ="hola"
  foo.exec(sayHello,"Santi")

  // My Formal definition of closures...

  // The block of code can be passed around as value and
  // It can be executed on demand by anyone who has the value at which time
  // It can refer to variable from the context in which it was created(i.e it is closed with respect to variable
  // access.In mathematical sense of the word "closed"

  // A Second Example
  var votingAge = 18
  val isOfVotingAge = (age: Int) => if (age > votingAge) true else false

  foo.printResult(isOfVotingAge,15)

  // Support for more complex data types...

  import scala.collection.mutable.ArrayBuffer

  val fruits = ArrayBuffer("apple")


  val addToBasket = (s:String) => {

    fruits += s
    println(fruits.mkString(", "))
  }

  foo.buyStuff(addToBasket,"Mangoes")
  foo.buyStuff(addToBasket,"Grapes")


}
