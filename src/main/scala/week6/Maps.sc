

val romanNumerals = Map("I" -> 1,"V" -> 5,"x" -> 10)

val capitalOfCountry = Map("US" -> "Washington","Switzerland" -> "Bern")


capitalOfCountry get ("Russia")



// x pow 3 - 2x + 5
// expressed as a Map

Map(0 -> 5,1 -> -2,3 -> 1)


class Poly(val terms0 : Map[Int,Double]) {

  def this(bindings:(Int,Double)*) = this(bindings.toMap)

  val terms = terms0 withDefaultValue 0.0

  def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
  def ++ (other: Poly) = new Poly(other.terms.foldLeft(terms)(addTerm))

  def addTerm(terms: Map[Int,Double],term : (Int,Double)) : Map[Int,Double] = {
    val (exp,coeff) = term
    terms + (exp -> (coeff + terms(exp)))
  }

  def adjust(term : (Int,Double)) : (Int,Double) = {

    val (exp,coeff) = term
    exp -> (coeff + terms(exp))
  }

  override def toString =
    (for((exp,coeff)<- terms.toList.sorted.reverse)yield coeff+"x^"+exp) mkString " + "
}

val p1 = new Poly(1 -> 4.0, 3 -> 4.0, 5 -> 6.2)
val p2 = new Poly(Map(0 -> 3.2 ,3 -> 7.0))

p1 ++ p2