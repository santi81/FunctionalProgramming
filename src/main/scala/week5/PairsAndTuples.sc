


def mSort(xs: List[Int]) : List[Int] = {

  val n = xs.length/ 2

  if (n == 0) xs
  else
    {
      /*def merge(first: List[Int], second: List[Int]) : List[Int] = {

        first match {
          case Nil => second

          case head :: tail =>
            second match {
              case Nil => xs

              case secondHead :: secondTail =>
              if (head < secondHead) head :: merge(tail,second)
              else secondHead :: merge(first,secondTail)
            }
        }
      }*/

      def merge(first: List[Int], second: List[Int]) : List[Int] = (first,second) match {

        case (Nil,ys1) => ys1
        case (xs1,Nil) => xs1
        case (x :: xs1,y::ys1) =>
          if (x < y)  x :: merge(xs1,second) else y :: merge(first,ys1)

      }
      val (first,second) = xs splitAt n
      merge(mSort(first),mSort(second))

    }
}

val nums = List(2 , -4 ,5, 7, 1)

mSort(nums)