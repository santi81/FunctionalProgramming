

val n = 7


val pairVector = (1 until n).map(x => (1 until x).map(y => (x,y)))
val flatVector = pairVector.foldRight(Seq[Any]())(_ ++ _)




//map followed by flatten is flatMap

val pairVector2 = (1 until n).flatMap(x => (1 until x) map(y => (x,y)))
val pairVector3 = (1 until n).map(x => (1 until x).map(y => (x,y))).flatten


def isPrime(n: Int): Boolean = (2 until n) forall(d => n % d !=0)


val primePairs = (1 until n).flatMap(x => (1 until x) map(y => (x,y)) filter(p => isPrime(p._1 + p._2)))

for{

  i <- 1 until n
  j <- 1 until i
  isPrime(i + j)
}yield(i,j)


def scalarProduct(xs : Vector[Double], ys: Vector[Double]): Double = {

  {for{(x,y) <- xs zip ys}yield x * y}.sum
}


