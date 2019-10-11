package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/1/2019.
  *
  *  The collect function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  *  The collect method takes a Partial Function as its parameter and
  *  applies it to all the elements in the collection to create a new collection which satisfies the Partial Function
  *
  * def collect[B](pf: PartialFunction[A, B]): Traversable[B]
  *
  *
  * The collect method is a member of the TraversableLike trait.
  *
  */
object CollectFunction extends App{

  //1. How to initialize a Sequence which contains donut names and prices

  println("Step 1: How to initialize a Sequence which contains donut names and prices")
  val donutNamesandPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5)
  println(s"Elements of donutNamesAndPrices = $donutNamesandPrices")

  //2. How to use collect function to cherry pick all the donut names

  println("\nStep 2: How to use collect function to cherry pick all the donut names")
  val donutNames: Seq[String] = donutNamesandPrices.collect{ case name: String => {
                                                                                      name

                                                                                  }
                                                           }
  //We are making use of a Partial Function to filter elements of type String.
  println(s"Elements of donutNames = $donutNames")


  //3. How to use collect function to cherry pick all the donut prices

  println("\nStep 3: How to use collect function to cherry pick all the donut prices")
  val donutPrices: Seq[Double] = donutNamesandPrices.collect{ case price: Double => price }
  println(s"Elements of donutPrices = $donutPrices")







}
