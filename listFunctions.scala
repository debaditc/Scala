

object listFunctions {
  
  def main(args: Array[String]) 
  {
    val names = List("Apple","Bob","Babloo")
     
    var leng = 0
    // Without filter 
    for (name <- names if name.startsWith("B"))
    {
      //Length
      leng = name.length()
      println(leng)
    }
  
    // With filter 
    println("Filter - " + names.filter(_.startsWith("B")))
    
    // Length , filter and sort
    println("Sort - " + names.filter(_.length()>4))
  
    //Number list
    val x = List(1,22,3,44,5,16,7,18,9,120)
    println("Num - " + x.filter(x => x%2 == 0))
    
    // Short hand
    println("Num short hand- " + x.filter(_%2 == 0))
    println("Num sorted - " + x.filter(_%2 == 0).sorted)
       
    //TakeWhile
    println("Take while - "+ x.takeWhile(_ < 36).sorted)
    
    //Map function
    val y = List(4,12,3)
    println("Map num - " + y.map(_*3))
    
    println("Map names = " + names.map(_.toUpperCase()))
    println("Map names = " + names.map { x => "<i>"+x+"</i>"})
    
   /*
    length  - returns the length of a List
    head    - returns the first element of a List
    last    - returns the last element of a List
    init    - returns a List consisting of all elements except the last one
    tail    - returns every elements of a List except the first element
    isEmpty - returns a Boolean indicating if the List is empty
    
    reverse - returns a reversed version of the List
    flatten - takes a list of lists and flattens it out to a single list
    
    mkString - converts a List to a String    
    */
    
    //Iterator
    //Iterator can traverse only once - so no 2 operation at same iterator
     val ita = Iterator(20,40,2,50,69, 90)
    // println("Maximum valued element " + ita.max )
     
      while (ita.hasNext){
         println(ita.next())
      }
     
     //println("Minimum valued element " + ita.min )
     //to perform two different operations because iterator can be traversed only once
     
     
  }
}
