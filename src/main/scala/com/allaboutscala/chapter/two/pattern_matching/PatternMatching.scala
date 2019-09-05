package com.allaboutscala.chapter.two.pattern_matching

/**
  * Created by mkoduri on 8/29/2019.
  *
  *
  * If you have used Java or .NET in the past, pattern matching may at first sight appear similar to switch statements.
  * But, Scala's pattern matching is a lot more powerful!
  *
  * In this tutorial, we went over the following:

How to use basic pattern matching
How to use pattern matching and return the result back to the caller
How to use pattern matching with the wildcard operator
How to use pattern matching with two or more items on the same condition
How to use pattern matching with if expressions in the case clause
How to use pattern matching on types
  *
  */
object PatternMatching extends App{


  //1. Pattern matching 101 - a very basic example
  //   You should have noticed that unlike in Java or in .NET, there are no break statements!
  //   big thanks to Scala as the compiler is smart enough to prevent fall-through and hence there is no need to use a break clause with pattern matching.


  println("Step 1: Pattern matching 101 - a very basic example")
  val donutType = "Glazed Donut"
  donutType match {
    case "Glazed Donut" => println("Very tasty")
    case "Plain Donut" => println("Tasty")
  }


  //2. Pattern matching and return the result
  //   Scala's pattern matching can return the result back to the caller.
  //   Notice that you did not have to use the return keyword as you would in say Java or .NET.
  println("\nStep 2: Pattern matching and return the result")
  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel")



  //3. Pattern matching using the wildcard operator
  //    what if you needed to provide a default case?
  //    we use '_' wildcard charater underscore
  println("\nStep 3: Pattern matching using the wildcard operator")
  val donutTypeX = "Cinnamon Donut"
  val tasteLevel2 = donutTypeX match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donutTypeX = $tasteLevel2")



  //4. Pattern matching with two or more items on the same condition
  //   This behavior seems similar to an OR expression and you can use the pipe |

  println("\nStep 4: Pattern matching with two or more items on the same condition")
  val donutTypeY = "Strawberry Donut"
  val tasteLevel3 = donutTypeY match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donutTypeY = $tasteLevel3")


  //5. Pattern matching and using if expressions in the case clause
  //   you can simulate an OR clause by adding If Expression in the case statements.

  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val donutTypeA = "Strawberry Donut"
  val tasteLevel4 = donutTypeA match {
    case x if (x.contains("Glazed") || x.contains("Strawberry")) => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutTypeA = $tasteLevel4")
  // case x : if you use case X , uppercase X then it wont compile. It seems scala is taking lower case for case statment.



  //6. Pattern matching by types
  //   If you come from Java or .NET, you can think of the Any type similar to the Object class.
  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Donut price type = $priceType")
  //Donut price type = Double




}
