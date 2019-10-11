package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/4/2019.
  *
  * Chain futures using for comprehension
  *
  * we showed how you can make use of flatMap() method to chain multiple futures.
  *
  * Scala provides a syntactic sugar for flatMap() method which is called the for comprehension.
  * To this end, let's re-write the flatMap() example above and use for comprehension to chain and sequence futures.
  *
  *
  */
object Tutorial_04_Chain_Futures_For_Comprehension extends App{


  //1. Define a method which returns a Future
  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  println("\nStep 2: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    true
  }

  println("\nStep 3: Chaining Futures using for comprehension")
  for {
    stock     <- donutStock("vanilla donut")
    isSuccess <- buyDonuts(stock)
  } yield println(s"Buying vanilla donut was successful = $isSuccess")

  Thread.sleep(3000)

}
