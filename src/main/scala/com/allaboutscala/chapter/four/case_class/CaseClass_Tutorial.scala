package com.allaboutscala.chapter.four.case_class

/**
  * Created by mkoduri on 9/9/2019.
  *
  *
  * What is a case class?

    A case class is similar to any other classes except that it also creates the Companion Object.
    In addition, a case class will automatically create the apply(),  toString(), hashCode and equals() methods for you.
  *
  *
  * A case class also comes with a handy copy() method which you can use to copy an object and override any field.
    In return, the copy() method will create new instances of the given object.


  */
object CaseClass_Tutorial extends App{


  //1. How to define a case class to represent a Donut object

  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  //Donut("Vanilla Donut", 1.50).price = 2.40;

  //2. How to create instances or objects for the Donut case class

  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50)
  val glazedDonut: Donut = Donut("Glazed Donut", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  /*You did not have to use the new keyword when creating instances of the Donut case class.
  The case class will automatically create the Companion Object. see line 24 */


  //3. How to access fields of the Donut object

  println("\nStep 3: How to access fields of the Donut object")
  println(s"Vanilla Donut name field = ${vanillaDonut.name}")
  println(s"Vanilla Donut price field = ${vanillaDonut.price}")
  println(s"Vanilla Donut productCode field = ${vanillaDonut.productCode}")


  println("\nStep 4: How to modify or update fields of the Donut object")
  //vanillaDonut.name = "vanilla donut" // compiler error. fields are immutable by default.

 //As mentioned earlier, when you use a case class, the Scala compiler automatically creates the hashCode and equals() methods for you.
 //As an example, let's create a Map to represent the type and quantity of donuts being bought by our customers.
 //If you do not implement the hashCode method, adding and retrieving elements from the Map will give you unpredictable behaviour.
 //since we are using the case class to represent the Donut objects, the hashCode method is implemented for us!

  println("\nStep 5: How to define the hashCode and equals method for Donut object")
  val shoppingCart: Map[Donut, Int] = Map(vanillaDonut -> 4, glazedDonut -> 3)

  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of vanilla donuts in shopping cart = ${shoppingCart(vanillaDonut)}")
  println(s"Quantity of glazed donuts in shopping cart = ${shoppingCart(glazedDonut)}")



  //A case class also comes with a handy copy() method which you can use to copy an object and override any field.
  //In return, the copy() method will create new instances of the given object.
  println("\nTIP: How to create a new object of Donut by using the copy() method of the case class")
  val chocolateVanillaDonut: Donut = vanillaDonut.copy(name = "Chocolate And Vanilla Donut", price = 5.0)
  println(s"Chocolate And Vanilla Donut = $chocolateVanillaDonut")



}
