package com.allaboutscala.chapter.three.polymorphic_typed_functions

/**
  * Created by mkoduri on 9/1/2019.
  */
object PolymorphicTypedFunctions  extends App{


  //1. How to define a polymorphic typed function which has no return.
  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }


   //3. How to define a polymorphic typed function which also has a generic return type
  //    we are returning a new Sequence of type T for each of the cases within the pattern match.

  println("\nStep 3: How to define a generic typed function which also has a generic return type")

  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)

      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }

  //4. How to call a generic polymorphic function - applyDiscountWithReturnType - which also has a generic return type
  println("\nStep 4: How to call a generic typed function which also has a generic return type")
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println()
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

  println()
  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")

  //For each of the specified types used when calling the polymorphic function applyDiscountWithReturnType(), the function also returns the Sequence of the same type.

  //Scala's typed functions provide greater flexibility with the use of variances which we will see in upcoming tutorials.
}
