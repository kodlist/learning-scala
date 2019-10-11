package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The sortBy function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def sortBy[B](f: (A) ⇒ B)(implicit ord: math.Ordering[B]): Repr
  *
  * The sortBy method is a member of SeqLike trait.
  *
  */
object SortByFunction extends App{


  //1. How to create a case class to represent Donut objects

  println("\nStep 1: How to create a case class to represent Donut objects")
  case class Donut(name: String, price: Double)

  //2. How to create a Sequence of type Donut

  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 3.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")


  //3. How to sort a sequence of case class objects using the sortBy function

  println("\nStep 3: How to sort a sequence of case class objects using the sortBy function")
  println(s"Sort a sequence of case class objects of type Donut, sorted by price = ${donuts.sortBy(donut => donut.price)}")




}
