object excercise {
  def factorial (n : Int) : Int = {
    def loop(acc: Int, n: Int) : Int =
     if(n==0) acc
     else loop(acc*n, n-1)
    loop(1,n)
  }

  factorial(2)
  factorial(3)
  factorial(5)
}