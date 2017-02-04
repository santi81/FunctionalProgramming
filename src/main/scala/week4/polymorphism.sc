// Two principal forms of Polymorphism


// Sub-Typing

// Generics



// def assertAllPos[S <: IntSet](r:S):S = ...


// S <: T means  S is a subtype of T

// S >: T means S is a supertype of T or T is a subtype of
// S


// NonEmpty <: IntSet

// List[NonEmpty] <: List[Intset]

//Co-variant



// Variance

// Definition of Variance

//C[T] is a parameterized type and A,B are subtypes
// such that A <: B

// They are 3 possible relations between
// C[A] , C[B]

// C[A] <: C[B]  // Co-variant

// C[A] >: C[B] // Contra-variant

// C[A] ,C[B] are neither subtype nor supertype

// C is non-variant



// Scala lets you define the variance of a type

// C[+A]  C is Co-Variant

// C[-A] C is contra-variant

// C[A]  C is non-variant

