package com.allaboutscala.chapter.four.type_aliasing

/**
  * Created by mkoduri on 9/9/2019.
  *
  *
  * learn how to define and use type aliasing to create shortcuts to other types or functions.
  *
  * Type aliasing can be useful to help you provide more meaningful names which represent
  * your business or domain objects without having to create unnecessary types.
  *
  * eg: type CartItem[Donut, Int] = Tuple2[Donut, Int]
  *
  * usage: val cartItem = new CartItem(vanillaDonut, 4)
  *
  */
object TypeAlias_Tutorial extends App{


  //1. How to define a case class to represent a Donut object

  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)



  //2. How to create instances or objects for the Donut case class

  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  val glazedDonut: Donut = Donut("Glazed", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")



  //3. How to use type alias to name a Tuple2 pair into a domain type called CartItem

  //Instead of using a Tuple2 type to represent a Donut with its corresponding quantity being bought by a customer,
  // you can make use of type aliasing to alias the Tuple2 type.

  println("\nStep 3: How to use type alias to name a Tuple2 pair into a domain type called CartItem")
  type CartItem[Donut, Int] = Tuple2[Donut, Int]

  //4. How to create instances of the aliased typed CartItem

  println("\nStep 4: How to create instances of the aliased typed CartItem")
  val cartItem = new CartItem(vanillaDonut, 4)
  println(s"cartItem = $cartItem")
  println(s"cartItem first value = ${cartItem._1}")
  println(s"cartItem second value = ${cartItem._2}")


  //5. How to use an aliased typed into a function parameter

  //With the type alias CartItem from Step 3, creating a function to calculate the total cost of donut items in a shopping cart is more clear.

  println("\nStep 5: How to use an aliased typed into a function parame")
  def calculateTotal(shoppingCartItems: Seq[CartItem[Donut, Int]]): Double = {
    // calculate the total cost
    shoppingCartItems.foreach { cartItem =>
      println(s"CartItem donut = ${cartItem._1}, quantity = ${cartItem._2}")
    }
    10 // some random total cost
  }

  val seq_2 : Seq[CartItem[Donut, Int]] = Seq(new CartItem(vanillaDonut, 3) , new CartItem(glazedDonut, 2) )
  calculateTotal(seq_2)

  //6. How to use a case class instead of an aliased typed

  println("\nStep 6: How to use a case class instead of an aliased typed")
  case class ShoppingCartItem(donut: Donut, quantity: Int)

  val shoppingItem: ShoppingCartItem = ShoppingCartItem(Donut("Glazed Donut", 2.50), 10)
  println(s"shoppingItem donut = ${shoppingItem.donut}")
  println(s"shoppingItem quantity = ${shoppingItem.quantity}")



  //7. How to use case class from Step 6 to represent a Sequence of Donut items in a shopping cart


  println("\nStep 7: How to use case class from Step 6 to represent a Sequence of Donut items in a shopping cart")
  def calculateTotal2(shoppingCartItems: Seq[ShoppingCartItem]): Double = {
    // calculate the total cost
    shoppingCartItems.foreach { shoppingCartItem =>
      println(s"ShoppingCartItem donut = ${shoppingCartItem.donut}, quantity = ${shoppingCartItem.quantity}")
    }
    10 // some random total cost
  }


  val cinamonDonut: Donut = Donut("Cinnamon Donut", 1.50)
  val blueberryDonut: Donut = Donut("Blueberry Donut", 2.0)

  //val seq: Seq[(Donut, Int)] = Seq( (cinamonDonut,2), (blueberryDonut, 2)  )

  val seq_1: Seq[(ShoppingCartItem)] = Seq( ShoppingCartItem( Donut("Cinnamon Donut", 1), 10), ShoppingCartItem( Donut("Blueberry Donut", 2), 10)   )

  calculateTotal2(seq_1)
  println(calculateTotal2(seq_1))  // this returns double 10.0 / as shown in line 88


}
