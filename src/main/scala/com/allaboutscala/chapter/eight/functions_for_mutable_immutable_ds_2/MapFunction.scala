package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The map function is applicable to both Scala's Mutable and Immutable collection data structures.
  * The map method takes a predicate function and applies it to every element in the collection.
  *
  * def map[B](f: (A) ⇒ B): Traversable[B]
  *
  * The map method is a member of the TraverableLike trait
  *
  *
  *
  */
object MapFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts1")


  //2. How to append the word Donut to each element using the map function

  println("\nStep 2: How to append the word Donut to each element using the map function")
  val donuts2: Seq[String] = donuts1.map(_ + " Donut")
  println(s"Elements of donuts2 = $donuts2")

  //We've used the wildcard operator _ inside the map method.

  //3. How to create a donut sequence with one None element

  println("\nStep 3: How to create a donut sequence with one None element")
  val donuts3: Seq[AnyRef] = Seq("Plain", "Strawberry", None)
  donuts3.foreach(println(_))

  //4. How to filter out the None element using map function

  println("\nStep 4: How to filter out the None element using map function")
  val donuts4: Seq[String] = donuts3.map {
    case donut: String => donut + " Donut"
    case None => "Unknown Donut"
  }

  println(s"Elements of donuts4 = $donuts4")

  //5. How to define couple of functions which returns an Option of type String

  println("\nStep 5: How to define couple of functions which returns an Option of type String")
  def favoriteDonut: Option[String] = Some("Glazed Donut")

  def leastFavoriteDonut: Option[String] = None


  //6. How to use map function to filter out None values

  println("\nStep 6: How to use map function to filter out None values")
  favoriteDonut.map(donut => println(s"Favorite donut = $donut"))
  leastFavoriteDonut.map(donut=> println(s"Least favorite donut = $donut"))


  //When leastFavoriteDonut function is called, nothing is printed because the map method has already filtered out None values.



}
