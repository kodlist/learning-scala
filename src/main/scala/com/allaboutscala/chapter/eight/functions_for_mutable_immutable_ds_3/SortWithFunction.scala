package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019
  *
  * The sortWith function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The sortWith method takes a predicate function and will use it to create a new collection
  * where the elements are sorted by the predicate function.
  *
  * def sortWith(lt: (A, A) ⇒ Boolean): Repr
  *
  * The sortWith method is a member of SeqLike trait.
  *
  *
  *
  */
object SortWithFunction extends App{

  //1. How to create a case class to represent Donut objects

  println("\nStep 1: How to create a case class to represent Donut objects")
  case class Donut(name: String, price: Double)


  //2. How to create a Sequence of type Donut

  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 3.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")

  //3. How to sort a sequence of case class objects using the sortWith function

  println("\nStep 3: How to sort a sequence of case class objects using the sortWith function")
  println(s"Sort a sequence of case classes of type Donut, sorted with price = ${donuts.sortWith(_.price < _.price)}")

  //4. How to sort a sequence of case class objects in ascending order using the sortWith function

  println("\nStep 4: How to sort a sequence of case class objects in ascending order using the sortWith function")
  println(s"Sort a sequence of case classes of type Donut, sorted with price in ascending order = ${donuts.sortWith(_.price < _.price)}")
  println(s"Sort a sequence of case classes of type Donut, sorted with price in ascending order explicitly = ${donuts.sortWith((d1,d2) => d1.price < d2.price)}")

  //5. How to sort a sequence of case class objects in descending order using the sortWith function
  println("\nStep 5: How to sort a sequence of case class objects in descending order using the sortWith function")
  println(s"Sort a sequence of case classes of type Donut, sorted with price in descending order = ${donuts.sortWith(_.price > _.price)}")
  println(s"Sort a sequence of case classes of type Donut, sorted with price in descending order explicitly = ${donuts.sortWith((d1,d2) => d1.price > d2.price)}")



}
