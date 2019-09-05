package com.allaboutscala.chapter.two.for_comprehension

/**
  * Created by mkoduri on 8/29/2019.
  *
  * Scala for comprehension can do much more!
  * As an example and similar to the previous tutorial on using IF And Else Expressions, the for construct in Scala can return a value!
  *
  * Moreover, as we get to tutorials on say Futures, you will see even more hidden powers of the for comprehension!
  */
object ForComprehension extends App{


  //1. A simple for loop from 1 to 5 inclusive : keyword to

  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  //2. A simple for loop from 1 to 5 NOT inclusive  : using keyword until

  println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for(numberOfDonuts <- 1 until 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  //3. Filter values using if conditions in for loop
  //let's store a List of ingredients for baking donuts into an immutable variable called donutIngredients

  println("\nStep 3: Filter values using if conditions in for loop")
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  for(ingredient <- donutIngredients if ingredient == "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }


  //4. Filter values using if conditions in for loop and return the result back using the yield keyword
  // Instead of using the (), we are using the {} in our for comprehension to make our expressions more explicit.

  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val sweeteningIngredients = for { ingredient <- donutIngredients if (ingredient == "sugar" || ingredient == "syrup") } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")


  //5. Using for comprehension to loop through 2-Dimensional array
   /*Let's create a 2-Dimensional array consisting of 4 elements of our donuts Ingredients.
   To do this, we will use Scala Array class and call the ofDim() function, pass in the type of String in square brackets [String] and then
   specify our 2 by 2 array in the function parameter.*/
   val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugars"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"
  //To iterate through your 2-Dimensional array. NOT inclusive  : using keyword until
  for { x <- 0 until 2
        y <- 0 until 2
  } {println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")}

}
