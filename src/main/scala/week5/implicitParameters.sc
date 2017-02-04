

// Parameterization with Ordering///

// scala.math.Ordering[T]

import scala.math.Ordering

def mSort[T](xs: List[T])(implicit ord:Ordering[T]) : List[T] = {

  val n = xs.length/ 2

  if (n == 0) xs
  else
  {

    def merge(first: List[T], second: List[T]) : List[T] = (first,second) match {

      case (Nil,ys1) => ys1
      case (xs1,Nil) => xs1
      case (x :: xs1,y::ys1) =>
        if (ord.lt(x,y))  x :: merge(xs1,second) else y :: merge(first,ys1)

    }
    val (first,second) = xs splitAt n
    merge(mSort(first),mSort(second))
  }
}


val nums = List(2 , -4 ,-5, 7, 1)

val fruits = List("Apples","PineApples","Grapes","Mangoes")

mSort(nums)

mSort(fruits)