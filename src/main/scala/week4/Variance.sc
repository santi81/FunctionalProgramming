// Im-Mutable types can be co-variant but not mutable types


//


// If A <: B

// C[A] <: C[B] //  C is Co-Variant

//C[A> >: C[B>  //  C is Contra-variance


// C[A], C[B] are not related ... C is Invariant



// Class C[+A]   C is Co-Variant

// Class C[-A]   C is Contra-Variant





// type A = IntSet => NonEmpty

// type B = NonEmpty => IntSet


// A <: B


// A1 => B1   A2 => B2

// A2 <: A1  B1 <:B2


// A1 => B1 <: A2 =>B2



// Functions are contra-variant in argument types and co-variant in result types


// trait Function1[-T, +U] {def apply(x:T}: U => ???}

def sample0(x:Int): Int =  x * x

val sample1 = (x:Int) => x * x

val sample2:(Int) => Int = (x:Int) => x * x

val sample3 = new Function1[Int,Int] {
  def apply(x:Int):Int = x * x
}



val sample4 = new PartialFunction[Any,Any] {

  def isDefinedAt(x:Any) = x match {

    case a:Integer => true
    case b: String => true
    case _ => false

  }

  def apply(x:Any) = x match {

    case a:Integer => a * a
    case b: String => b + b

  }

}

sample4.isDefinedAt(2.4)




