package com.allaboutscala.unittest_one

/**
  * Created by mkoduri on 10/8/2019.
  *
  * In Chapter 9 on Futures Tutorials, we showed how you can create asynchronous non-blocking operations by making use of Scala Futures.
  *
  *
  *
  *
  *
  */

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}
import scala.concurrent.Future

import java.util.concurrent._

class Tutorial_09_Future_Test extends FlatSpec with Matchers with ScalaFutures{



  //Let's go ahead and add an asynchronous method named donutSalesTax()

  //Next, you can provide your own PatienceConfig to determine the duration of the future operation

  implicit override val patienceConfig: PatienceConfig = PatienceConfig(timeout = Span(5, Seconds), interval = Span(500, Millis))

  //try commenting above line and run th ecode again.

  val donutStore = new DonutStoreD()

  "Example of testing asynchronous futures" should "be valid" in {
      //val donutStore = new DonutStoreD()
    val donutSalesTaxFuture = donutStore.donutSalesTax("vanilla donut")

    whenReady(donutSalesTaxFuture) { salesTaxForVanillaDonut =>
      println(s" $salesTaxForVanillaDonut")
      println(salesTaxForVanillaDonut)
      salesTaxForVanillaDonut shouldEqual 0.15
    }
  }

  Thread.sleep(3000)


}


class DonutStoreD {
  def favouriteDonut(): String = "vanilla donut"

  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")

  def donutPrice(donut: String): Option[Double] = {
    val prices = Map(
      "vanilla donut" -> 2.0,
      "plain donut"   -> 1.0,
      "glazed donut"  -> 3.0
    )
    val priceOfDonut = prices.get(donut)
    priceOfDonut.map{ price => price * (1 - discountByDonut(donut)) }
  }

  private def discountByDonut(donut: String): Double = {
    val discounts = Map(
      "vanilla donut" -> 0.2,
      "plain donut"   -> 0.1,
      "glazed donut"  -> 0.3
    )
    discounts.getOrElse(donut, 0)
  }

  import scala.concurrent.ExecutionContext.Implicits.global

  def donutSalesTax(donut: String): Future[Double] = Future {
    Thread.sleep(3000) // assume an external call to calculate sales tax
    0.15
  }
  //As shown below, by simply importing org.scalatest.PrivateMethodTest._, you get access to an easy syntax for testing private methods using ScalaTest.

}