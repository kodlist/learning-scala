package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The sorted function is applicable to both Scala's Mutable and Immutable collection data structures.
  * The sorted method will return a new collection with elements sorted by their natural order.
  *
  * def sorted[B >: A](implicit ord: math.Ordering[B]): Repr
  *
  * The sorted method is a member of SeqLike trait.
  *
  */
object SortedFunction extends App{

  //1. How to initialize donut prices

  println("Step 1: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //2. How to sort a sequence of type Double using the sorted function

  println("\nStep 2: How to sort a sequence of type Double using the sorted function")
  println(s"Sort a sequence of type Double by their natural ordering = ${prices.sorted}")

  //3. How to initialize a Sequence of donuts

  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //4. How to sort a sequence of type String using the sorted function

  println("\nStep 4: How to sort a sequence of type String using the sorted function")
  println(s"Sort a sequence of type String by their natural ordering = ${donuts.sorted}")



}
