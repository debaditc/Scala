class datadef(val x:Int, val y:Int)
{
  private[datadef] val a = x
  private[datadef] val b = y  
}

class area (override val x:Int,override val y:Int) extends datadef(x,y)
{
   def rect(x : Int,y:Int):Int={
    x*y
  }
  
   def square(x : Int):Int={
    x*x
  }
  
   def circle(x : Int) : Double = {
   3.14*x*x
  }
   
}

object classObj {
  
 def main (args: Array[String])
 {
   val areaobj = new area(4,5)
   
   val circle = areaobj.circle(4)
   val rect = areaobj.rect(4,5)
   val sq = areaobj.square(4)
   
   println("Area of circle - " + circle)
   println("Area of rectangle - " + rect)
   println("Area of square - " + sq)
   
 }
 
}
