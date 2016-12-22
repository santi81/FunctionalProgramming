
class Foo {

  def exec(f:(String) => Unit,name: String)
  {
    f(name)
  }

  def printResult(f:(Int) => Boolean,age:Int): Unit = {

    println(s"""Age is ${f(age)}""")

  }

  def buyStuff(f:(String) => Unit,s:String):Unit ={

    f(s)
  }

}
