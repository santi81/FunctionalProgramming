
object exercise extends App {


  def product(f: Int => Int)(a: Int, b: Int) : Int = {
    if(a > b) 1
    else f(a) * product(f)(a + 1, b)

  }

  def fact(number : Int) = {

    product(x=>x)(1,number)

  }

  println(product(x =>x)(1,3))
  println(fact(5))


  def mapReduce(f: Int => Int,combine: (Int,Int) => Int,zeroVal: Int)(a: Int,b: Int) : Int = {
    if( a > b) zeroVal
    else combine(f(a),mapReduce(f,combine,zeroVal)(a + 1,b))
  }


  def productImproved(f:Int => Int)(a: Int,b:Int): Int ={

    mapReduce(f,(x:Int,y:Int) => x * y,1)(a,b)

  }

}
