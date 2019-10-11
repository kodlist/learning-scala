package com.allaboutscala.unittest_one


import org.scalatest._



/**
  * Created by mkoduri on 10/8/2019.
  *
  * private methods.
  *
  *
  */
class Tutorial_08_Private_Method_Test extends FlatSpec with Matchers {


  "Example of testing private method" should "be valid" in {
    val donutStore = new DonutStoreB()
    val priceWithDiscount = donutStore.donutPrice("vanilla donut")
    priceWithDiscount shouldEqual Some(1.6)

    // test the private method discountByDonut()
    import org.scalatest.PrivateMethodTester._

    val discountByDonutMethod = PrivateMethod[Double]('discountByDonut)
    val vanillaDonutDiscount = donutStore invokePrivate discountByDonutMethod("vanilla donut")
    vanillaDonutDiscount shouldEqual 0.2
  }


}


class DonutStoreB {
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

 //As shown below, by simply importing org.scalatest.PrivateMethodTest._, you get access to an easy syntax for testing private methods using ScalaTest.

}