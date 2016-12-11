

object loopClosure {
  
  def main (args : Array[String])
  {
    var a = Array(1,2,3,4,5,6)
    
    // for with filter
   for (i <- a if (a(i-1) % 2 == 0))
   {
      println(a(i-1))
   }
    
   // yield function
   var result = for {i <- a} yield i
   
   
   println("Result - " + result)
   
   for (j <- result)
   {
      println("Result - " + j)
   }
   
   // Use of closures
   var factor = 3
    var mul = (i : Int) => i * factor
    
    println("Mul - " + mul(3))
   
  }
  
}
