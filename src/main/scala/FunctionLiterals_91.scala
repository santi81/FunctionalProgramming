
object FunctionLiterals_91 extends App {

  val x = List.range(1, 10)

  val evens= x.filter((i:Int) => i%2 == 0)
  println(evens)

  val z = x.filter(_ %2 == 0)

  val anotherVariant = x.filter(i => i % 2 == 0)

}
