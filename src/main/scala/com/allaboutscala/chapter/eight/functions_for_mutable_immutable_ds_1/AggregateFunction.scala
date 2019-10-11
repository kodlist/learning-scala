package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 9/26/2019.
  *
  * The aggregate method aggregates results by first applying a sequence operation which is its first parameter
  * and then uses a combine operator to combine the results produced by the sequence operation.
  *
  * def aggregate[B](z: =>B)(seqop: (B, A) => B, combop: (B, B) => B): B = foldLeft(z)(seqop)
  *
  * The aggregate method is a member of the TraversableOnce trait.
  *
  * aggregate function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  */
object AggregateFunction extends App{


  //1. How to initialize a Set of type String to represent Donut elements

  println("Step 1: How to initialize a Set of type String to represent Donut elements")
  val donutBasket1: Set[String] = Set("Plain Donut" , "Cream Donut")
  println(s"Elements of donutBasket1 = $donutBasket1")

  //2. How to define an accumulator function to calculate the total length of the String elements

  println("\nStep 2: How to define an accumulator function to calculate the total length of the String elements")
  val donutLengthAccumulator: (Int, String) => Int = (accumulator, donutName) => {
    println(s" accumulator = $accumulator : donutName = $donutName ");
    var x = accumulator + donutName.length;
    println(s" accumulator = $accumulator : donutName = $x ");
    //this returns Int
    x ;
  }

  //We are making use of a Value Function.

  //3. How to call aggregate function with the accumulator function from Step 2

  println("\nStep 3: How to call aggregate function with the accumulator function from Step 2")
  val totalLength = donutBasket1.aggregate(0)(donutLengthAccumulator, _ + _)
  println(s"Total length of elements in donutBasket1 = $totalLength")


  //4. How to initialize a Set of Tuple3 elements to represent Donut name, price and quantity

  println("\nStep 4: How to initialize a Set of Tuple3 elements to represent Donut name, price and quantity")
  val donutBasket2: Set[(String, Double, Int)] = Set(("Plain Donut", 1.50, 10), ("Strawberry Donut", 2.0, 10))
  println(s"Elements of donutBasket2 = $donutBasket2")



  //5. How to define an accumulator function to calculate the total cost of Donuts

  println("\nStep 5: How to define an accumulator function to calculate the total cost of Donuts")
  val totalCostAccumulator: (Double, Double, Int) => Double  = { (accumulator, price, quantity) =>  {

    println(s"  accumulator = $accumulator : price = $price   :  quantity = $quantity ")
    //this returns double
    accumulator + (price * quantity)

    }
  }


  //6. How to call aggregate function with accumulator function from Step 5
  println("\nStep 6: How to call aggregate function with accumulator function from Step 5")
  val totalCost = donutBasket2.aggregate(0.0)((accumulator: Double, tuple: (String, Double, Int)) =>  totalCostAccumulator(accumulator, tuple._2, tuple._3) ,   _ + _ )


  println(s"Total cost of donuts in donutBasket2 = $totalCost")






}
