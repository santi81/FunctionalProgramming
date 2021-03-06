

def mSort[T](xs: List[T])(comp:(T,T) => Boolean) : List[T] = {

  val n = xs.length/ 2

  if (n == 0) xs
  else
  {

    def merge(first: List[T], second: List[T]) : List[T] = (first,second) match {

      case (Nil,ys1) => ys1
      case (xs1,Nil) => xs1
      case (x :: xs1,y::ys1) =>
        if (comp(x,y))  x :: merge(xs1,second) else y :: merge(first,ys1)

    }
    val (first,second) = xs splitAt n
    merge(mSort(first)(comp),mSort(second)(comp))
  }
}


val nums = List(2 , -4 ,5, 7, 1)

mSort(nums)((x,y)=> x<y)


// Parameterization with Ordering///

// scala.math.Ordering[T]