import java.util.Date

object scalaFunc {
  
  def main (args : Array[String])
  {
    //Pass by value
    println("Simple add - " + add(3,4))
    
    //Pass arg
    println("Pass string - " + printstring("A","B","C"))
    
    //recursion
    println("Factorial - " + fact(5))
    
    //currying function
    println("Curry function - " + cat("Hello")("World"))
    
    //Partially applied function
    val date = new Date
    val logWithDateBound = log(date, _ : String)
    logWithDateBound("message1" )
  }
  
  //Simple
  def add (a : Int , b : Int) = {
    var c = a+b
    c
  }
  
  //Arguments
  def printstring(args : String*) =
  {
    var s = for (a <- args)yield a
    
    s.toString()
  }
  
  //Recursion - factorial
  def fact(f : Double) : Double = {
    if (f<=1)
      1
    else
      f*fact(f-1)  
  }
  
  //Currying function
  def cat(a : String) (b : String) = {
    
    a+"!! "+b
    
  }
  
  //Partially applied function
  def log(date: Date, message: String) = {
      println(date + "----" + message)
   }
}
