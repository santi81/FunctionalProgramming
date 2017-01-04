

def sum(f: Int => Int): (Int,Int) => Int = {
  def sumF(a: Int,b: Int) : Int = {

    if(a > b) 0
    else f(a) + sumF(a + 1, b)
  }
  sumF
}


def sumInts = sum(x => x)
def sumCubes  = sum(x => x * x * x)
sumInts(1,10)
sumCubes(1,3)

def cube(x: Int) : Int = x * x * x


sum(cube)(1,3)

(sum(cube))(1,3)


def sumImproved(f: Int => Int)(a: Int,b: Int) : Int = {
  if (a > b) 0
  else
    f(a) + sumImproved(f)(a +1, b)
}

sumImproved(cube)(1,3)



