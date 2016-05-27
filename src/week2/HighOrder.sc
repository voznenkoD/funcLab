object exercise2{
  def sum(f: Int => Int, a: Int, b: Int): Int =  {
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a+1,acc+f(a))
    }
    loop(a,0)
  }

  def product(f: Int => Int)(a: Int, b: Int) : Int = mapReduce(f, (x,y) => x*y, 1)(a,b)
  def factorial(n: Int): Int = {
    product(x=>x)(1,n)
  }

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int) : Int = {
    if(a>b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  }

  factorial(2)
  factorial(3)

}