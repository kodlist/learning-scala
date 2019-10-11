package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * andThen() is used whenever you have a need to apply a side-effect function on the result returned by the future.
  *
  *
  */
object Tutorial_15_Future_AndThen extends App{


  //1. Define a method which returns a Future

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future


  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  //2. Call Future.andThen with a PartialFunction

  //Next, we will pass-through a Partial Function to the future returned by the donutStock() method.
  //Note however, that the stockQty within the andThen() function is not of type Int but instead a Try[Int].
  /*If you were to look at the Scala implementation of andThen() function, you will notice that a try-catch is used which results in a Try[T].*/

  println(s"\nStep 2: Call Future.andThen with a PartialFunction")
  val donutStockOperation = donutStock("vanilla donut")
  println(s"  $donutStockOperation")
  donutStockOperation.andThen { case stockQty => println(s"Donut stock qty = $stockQty")}


  Thread.sleep(3000)


}
