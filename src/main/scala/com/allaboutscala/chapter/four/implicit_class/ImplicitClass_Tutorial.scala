package com.allaboutscala.chapter.four.implicit_class

/**
  * Created by mkoduri on 9/9/2019.

  * use Implicit Class to add methods to an object without modifying the source code of the object - also commonly known as extension methods.
  *
  * Using Implicit Class to extend functionality of an object can be quite handy especially when you do have have access to modify the source object.
  *
  *
  */
object ImplicitClass_Tutorial extends App{


  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  //2. How to create instances or objects for the Donut case class
  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")


 // 3. How to define an implicit class to augment or extend the Donut object with a uuid field
      //Assume that you were given a Donut type in a library or dependency and as such do not have access to modify the Donut source code.
      // In addition, say you are given a requirement to create a unique identifier for the Donut type.
      //With Implicit Class, you can easily extend the functionality of the Donut type.

  /*In the example below, we add a new method named uuid which returns a String and it uses the name and productCode of the Donut type to construct the unique id.*/

  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  object DonutImplicits {
    implicit class AugmentedDonut(donut: Donut) {
      def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }
  }

  /*NOTE:

    It's a good practice to encapsulate Implicit Classes into an object which can later be injected or referenced.
    In real life you probably would not hardcode the uuid value using donut.productCode.getOrElse(12345)
     but this is just an example of how to add a default value if the productCode field is None.*/

  //4. How to import and use the implicit class AugmentedDonut from Step 3

  /*Since we've wrapped and encapsulated the AugmentedDonut Implicit Class inside the DonutImplicits object,
    to use the Implicit AugmentedDonut class you simply need to import it as shown below.*/

  println("\nStep 4: How to import and use the implicit class AugmentedDonut from Step 3")

  import DonutImplicits._
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")



 /* While we've shown how to wrap Implicit Classes inside an object, it is also common to encapsulate Implicit Classes inside Package Object.
*/


}
