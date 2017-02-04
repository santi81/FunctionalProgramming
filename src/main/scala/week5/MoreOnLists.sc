import scala.annotation.tailrec


val myList = List(1,2,3)

myList.length

myList.last

myList.init


myList take 2

myList drop 2

myList(2)

val anotherList = List(4,5,6)

myList ++ anotherList

myList.reverse

myList.updated(2,4)



myList indexOf 4

myList contains 3



@tailrec
def last[T](xs: List[T]) : T = xs match {

  case List() => throw new Error("Empty List")

  case List(x) => x

  case head :: tail => last(tail)

}

last(myList)


def init[T](xs: List[T]): List[T] = xs match {

  case List() => throw new Error("Empty List")

  case List(x) => List()

  case head :: tail => head :: init(tail)

}

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {

  case List() => ys

  case List(x) => x :: ys

  case head :: tail => head :: concat(tail,ys)

}

def reverse[T](xs: List[T]): List[T] = xs match {

  case List() => List()

  case List(x) => List(x)

  case head :: tail => reverse(tail) ++ List(head)


}

def removeAt[T](xs:List[T],pos:Int): List[T] = xs.take(pos) ++ xs.drop(pos + 1)

removeAt(myList,0)