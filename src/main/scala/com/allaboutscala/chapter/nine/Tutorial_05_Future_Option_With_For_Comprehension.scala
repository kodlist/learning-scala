package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/4/2019.
  */
object Tutorial_05_Future_Option_With_For_Comprehension extends App{

  //1. Define a method which returns a Future Option

  println("Step 1: Define a method which returns a Future Option")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Option[Int]] = Future {
    // assume some long running database operation
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }

  //1. 2. Define another method which returns a Future

  println("\nStep 2: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    if(quantity > 0) true else false
  }


  //3. Chaining Future Option using for comprehension

  println("\nStep 3: Chaining Future Option using for comprehension")
  for {
    someStock  <- donutStock("vanilla donut")
    isSuccess  <- buyDonuts(someStock.getOrElse(0))
  } yield println(s"Buying vanilla donut was successful = $isSuccess")

  Thread.sleep(3000)

}
