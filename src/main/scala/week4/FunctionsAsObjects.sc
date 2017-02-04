

val temp = (x: Int) => x * x

temp(5)


class anonFun extends Function1[Int,Int]{

  def apply(x:Int): Int = x * x
}


val inst = new anonFun

inst(5)


val shortForm = new Function1[Int,Int] {

  def apply(x:Int): Int = x * x

}

shortForm(5)


trait List[+T]{

def isEmpty: Boolean
  def head: T
  def tail : List[T]
  def prepend[U >:T](elem:U): List[U] = new cons(elem,this)

}


class cons[T](val head:T,val tail: List[T]) extends List[T]{

  def isEmpty = false
}

object Nil extends List[Nothing]{


  def isEmpty = true

  def head:Nothing = throw new NoSuchElementException("Nil.Head")
  def tail:Nothing = throw new NoSuchElementException("Nil.Tail")
}

object List {

  def apply[T](x1:T,x2:T): List[T] = new cons(x1,new cons(x2,Nil))
  def apply[T](): List[T] = Nil

}


List(3,4)
List()

// Co-Variant type parameters can appear in lower bound

//Contra-variant type parameters can appear in upper bound


