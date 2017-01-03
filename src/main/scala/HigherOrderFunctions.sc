import scala.annotation.tailrec


def sumInts(a: Int, b: Int) : Int = {
  if (a > b) 0 else a + sumInts(a+1, b)
}

def cube(x:Int ) = x * x * x


def sumCubes(a: Int, b:Int): Int = {

  if (a > b) 0 else cube(a) + sumCubes(a+1, b)

}

def fact(x : Int) = {
  @tailrec
  def innerFact(number:Int, acc:Int) : Int = {


    if (number == 1 ) acc else innerFact(number-1, acc * number)
  }

 innerFact(x,1)

}

def sumFactorials(a:Int, b:Int): Int = {

  if(a > b) 0 else fact(a) + sumFactorials(a+1, b)

}

def sum(f : Int => Int, a: Int, b: Int): Int = {
  if(a > b) 0
  else f(a) + sum(f,a + 1, b)

}

def id(x: Int) : Int = x



def sumIntsV1(a: Int, b: Int) : Int = {
  sum(id,a,b)
}

def sumCubesV1(a: Int, b: Int) : Int = {
  sum(cube, a, b)
}


def sumFactorialsV1(a: Int, b: Int) : Int = {
  sum(fact, a, b)
}


def sumIntsAnon(a: Int,b: Int) : Int = sum((x:Int) => x ,a ,b)

def sumCubesAnon(a: Int, b: Int): Int = sum(x => x * x * x ,a ,b)

def sumTailRec(f: Int => Int, a: Int ,b : Int) : Int = {

  @tailrec
  def loop(acc : Int,a: Int) : Int = {
    if (a > b) acc
    else loop(acc * a, a + 1)
  }
  loop(1 , a)
}

sumIntsV1(1,10)