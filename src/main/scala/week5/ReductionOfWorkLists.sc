

def sum(xs: List[Int]):Int = xs match {

  case Nil => 0
  case head :: tail => head + sum( tail )


}

sum(List(1,2,3))


List(1,2,3).reduceLeft((x,y) => x + y)

List(1,2,3).reduceLeft(_ + _)


List(1,2,3).foldLeft(1)(_ * _)



def concat[T](xs:List[T],ys:List[T]): List[T] = {

  xs.foldRight(ys)((x,y) => x:: y)

}

concat(List(1,2,3),List(4,5,6))

def mapFun[T,U](xs:List[T],f:T=>U): List[U] = {

  xs match {
    case head :: tail =>  f(head) :: mapFun(tail,f)
    case Nil => Nil
  }
}

mapFun(List(1,2,3),(x:Int) => x * 3)


def mapFun2[T,U](xs:List[T],f:T=>U): List[U] = {

  xs.foldRight(List[U]())((x:T,y:List[U]) => f(x) :: y)

}

mapFun2(List(1,2,3),(x:Int) => x * 3)


def lengthFun[T](xs:List[T]): Int = {

  xs.foldRight(0)((x,y)=> 1 + y)

}


lengthFun(List(1,2,3,4))

def lengthFun2[T](xs:List[T]): Int = {

  xs.foldLeft(0)((x,y)=> x + 1)

}

lengthFun2(List(1,2,3,4))