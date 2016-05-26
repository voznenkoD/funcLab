object hometask{
  def pascal(c: Int, r: Int): Int = {
    def loop(acc: Int, r: Int, c: Int) : Int =
      if(c==0 || c>=r) acc+1
      else loop(acc,r-1, c-1)+loop(acc,r-1,c)
    loop(0,r, c)
  }


  List(5,10,20,50,100,800,500).sortWith(_<_)



}