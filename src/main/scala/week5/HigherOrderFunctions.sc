val numList = List(1,2,-2,3,4,5,7,-4)
numList filter (x => x > 0)
numList filterNot (x => x > 0)
numList partition (x => x > 0)
numList takeWhile (x => x > 0)
numList dropWhile (x => x > 0)
numList span (x => x > 0)
def pack[T](xs : List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case head :: tail =>
    val subList = xs.span(x => x == head )
    subList._1 :: pack(subList._2)
}
pack(List("a","a","a","b","b","c","a"))
def encode[T](xs: List[T]):List[(T,Int)] = {
  val packedList = pack(xs)

  packedList.map(x => (x.head,x.size))
}

encode(List("a","a","a","b","b","c","a"))