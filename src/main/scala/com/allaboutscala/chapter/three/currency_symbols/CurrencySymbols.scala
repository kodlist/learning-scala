package com.allaboutscala.chapter.three.currency_symbols

/**
  * Created by mkoduri on 9/4/2019.
  *
  *
  * //   print UK pound symbol or US dollar
  *
  */
object CurrencySymbols extends App{

  println("Step 1: How to define a List with Tuple3 elements")
  val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla Donut", 10, 3.50))


  //2. How to define a function to loop through each Tuple3 elements of the List and calculate total cost

  println("\nStep 2: How to define a function to loop through each Tuple3 of the List and calculate total cost")
  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach { order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  //3. How to call function with curried group parameter for List of Tuple3 elements
  //   print UK pound symbol
  println("\nStep 3: How to call function with curried group parameter for List of Tuple3 elements")
  println(s"Total cost of order = £${placeOrder(listOrders)(0.5)}")

}
