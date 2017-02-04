


class Rational(x: Int, y: Int) {

  require(y > 0 ,"Denom Shud not be 0")

  def numer = x
  def denom = y
}


println("Welcome to my worksheet")

val x = new Rational(1,0)

println(x.numer)