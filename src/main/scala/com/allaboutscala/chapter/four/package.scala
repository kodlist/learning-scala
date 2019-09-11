package com.allaboutscala.chapter

/**
  * Created by mkoduri on 9/10/2019.
  *
  *
  */
package object four {


  //2. How to define a case class to represent a Donut object in a package object
  println("Step 2: How to define a case class to represent a Donut object in a package object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)


  //3. How to define an implicit class to augment or extend the Donut object with a uuid field
      //Next let's declare an Implicit class to extend the functionality of the Donut type which will add an additional uuid method to donut objects.

  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }


  //4. How to alias JodaTime to a DateTime type
  println("\nStep 4: How to alias JodaTime to a DateTime type")
  type DateTime = org.joda.time.DateTime
}
