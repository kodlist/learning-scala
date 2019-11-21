package com.allaboutscala.chapter.four.try_catch

/**
  * Created by mkoduri on 11/1/2019.
  *
  *
  */
object TryCatch_Ex {


  def main(args : Array[String]) : Unit = {

    var somx = new SomeX();

    try{
      somx.displayAmount(22);
    } catch{
      case e: ArithmeticException => println("Arithmetic Exception occured")
      case e: Exception => println("Exception occured")
    } finally {
        println("in finally block")
    }
  }

}

class SomeX{

  def displayAmount(amt : Double): Unit ={
    println("Your electricty bill is : "+ amt)
  }
}
