

val myArray = Array(1,2,3,44)

myArray.map(x => x* 2)

val myString = "Hello World"

val filteredString = myString.filter(x => x.isUpper)



val list1 = List(1,2,3,4)

val list2 = List(2,4,6)

list1 zip list2

myString.flatMap(x => List(" ",x))

(1 to 10).flatMap(x=> (1 to 10).map(y => (x,y)))



def scalarProduct(xs : Vector[Double], ys: Vector[Double]): Double = {

  (xs zip ys).map(xy => xy._1 * xy._2).sum
}

scalarProduct(Vector(1,2,3),Vector(4,5,6))



def scalarProduct2(xs : Vector[Double], ys: Vector[Double]): Double = {

  (xs zip ys).map{case (x,y) => x * y}.sum
}


scalarProduct2(Vector(1,2,3),Vector(8,5,9))


def isPrime(n: Int): Boolean = (2 until n) forall(d => n % d !=0)

isPrime(5)