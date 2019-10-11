package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The partition function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def partition(p: (A) ⇒ Boolean): (Repr, Repr)
  *
  * The partition method is a member of the TraversableLike trait.
  *
  *
  *
  */
object PartitionFunction extends App{

  //1. How to initialize a sequence which contains donut names and prices

  println("Step 1: How to initialize a sequence which contains donut names and prices")
  val donutNamesAndPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5)
  println(s"Elements of donutNamesAndPrices = $donutNamesAndPrices")


  //2. How to split the sequence by the element types using partition function

  println("\nStep 2: How to split the sequence by the element types using partition function")
  val namesAndPrices: (Seq[Any], Seq[Any]) = donutNamesAndPrices.partition {
                                                        case name: String => true
                                                        case price: Double => false
                                              }
  println(s"Elements of namesAndPrices = $namesAndPrices")

  // if we put true for price also then we get signle list of donut name with price.

  //3. How to access the donut String sequence from Step 2
  //A tuple was created as a result of using the partition method in Step 2.
  println("\nStep 3: How to access the donut String sequence from Step 2")
  println(s"Donut names = ${namesAndPrices._1}")

  //4. How to access the donut prices sequence from Step 2

  println("\nStep 4: How to access the donut prices sequence from Step 2")
  println(s"Donut prices = ${namesAndPrices._2}")

  //5. How to extract the pair returned by partition function

  println("\nStep 5: How to extract the pair returned by partition function")
  val (donutNames, donutPrices) = donutNamesAndPrices.partition {
    case name: String => true
    case _ => false
  }
  println(s"donutNames = $donutNames")
  println(s"donutPrices = $donutPrices")






}
