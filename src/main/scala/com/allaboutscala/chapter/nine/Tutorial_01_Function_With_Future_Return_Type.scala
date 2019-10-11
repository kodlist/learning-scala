package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/4/2019.
  */
object Tutorial_01_Function_With_Future_Return_Type extends App{


  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  //Note however that instead of returning an Int type, we are returning a Future of type Int, i.e., Future[Int].
  //We've had to import scala.concurrent.Future to have access to the Future type
  //We've also had to import scala.concurrent.ExecutionContext.Implicits.global which will place a default thread pool in scope
  //on which our Future will be executed asynchronously. If you are not familiar with ExecutionContext, that's OK,
  //we will provide additional examples in this chapter.


  println("\nStep 2: Call method which returns a Future")

  import scala.concurrent.Await

  import scala.concurrent.duration._

  val vanillaDonutStock = Await.result(donutStock("vanilla donut"), 5 seconds)
  println(s"Stock of vanilla donut = $vanillaDonutStock")

  //In general, avoid blocking!
  //As we progress through the examples in this tutorial, we will show other solutions to avoid blocking on futures.






}
