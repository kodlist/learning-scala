package com.allaboutscala.unittest_one



import org.scalatest._

/**
  * Created by mkoduri on 10/7/2019.
  */
class Tutorial_05_Collection_Test  extends FlatSpec with Matchers{


  "Examples of collection assertions" should "be valid" in {
    val donutStore = new DonutStore()
    val donuts = donutStore.donuts()
    donuts should contain ("plain donut")
    donuts should not contain "chocolate donut"
    donuts shouldEqual Seq("vanilla donut", "plain donut", "glazed donut")
  }



}
