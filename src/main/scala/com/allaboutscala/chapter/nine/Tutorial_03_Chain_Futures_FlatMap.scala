package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/4/2019.
  *
  * Chain futures using flatMap
  *
  *
  *
  *
  */
object Tutorial_03_Chain_Futures_FlatMap extends App{


  //1. Define a method which returns a Future
  //   Similar to the previous examples, we'll define a method called donutStock() which returns a Future[Int].

  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  //2. Define another method which returns a Future

  println("\nStep 2: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    true
  }

  //3. Chaining Futures using flatMap
  val buyingDonuts: Future[Boolean] = donutStock("plain donut").flatMap(qty => buyDonuts(qty))

  import scala.concurrent.Await

  import scala.concurrent.duration._

  val isSuccess = Await.result(buyingDonuts, 5 seconds)

  println(s"Buying vanilla donut was successful = $isSuccess")



}
