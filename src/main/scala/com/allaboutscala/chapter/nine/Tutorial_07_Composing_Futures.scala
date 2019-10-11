package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * Composing futures
  *
  *  In this section, we will provide some additional details on the idea of composing futures.
  *
  *
  *
  */
object Tutorial_07_Composing_Futures extends App{

  //1. Define a method which returns a Future Option

  println("Step 1: Define a method which returns a Future Option")
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global


  def donutStock(donut: String): Future[Option[Int]] = Future {
    // assume some long running database operation
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }

  //2. Define another method which returns a Future
  println("\nStep 2: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    if(quantity > 0) true else false
  }

  //3. Calling map() method over multiple futures

  println(s"\nStep 3: Calling map() method over multiple futures")
  val resultFromMap: Future[Future[Boolean]] = donutStock("vanilla donut")
                                          .map(someQty => buyDonuts(someQty.getOrElse(0)))

  Thread.sleep(1000)
  println(s"  $resultFromMap ")
  //Note however that using map() creates nesting in the return type.

  println(s"\nStep 4: Calling flatMap() method over multiple futures")
  val resultFromFlatMap: Future[Boolean] = donutStock("vanilla donut")
                                             .flatMap(someQty => buyDonuts(someQty.getOrElse(0)))

  Thread.sleep(1000)
  println(s"  $resultFromFlatMap ")
  //Note the return type of resultFromMap() is a Future of Future of type Boolean.


  //If you had to work on the restulFromMap() type, then you would be stuck in having to unwrap the nesting in order to access the values within the futures
  //In future tutorials, we will show how to make use of monadic transformers to help you work with nesting.


}
