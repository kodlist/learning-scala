package com.allaboutscala.chapter.five.traits_for_dependencyinjection

/**
  * Created by mkoduri on 9/12/2019.
  *
  *
  * we will show how to avoid the infamous Cake Pattern and instead opt for a Facade solution
  *
  * As you become more fluent in Functional Programming, the Facade solution be very handy to help you  design Monadic Functions.
  *
  *
  * The mock versions for each service have no implementations by using the syntax ???
  *
  * In a real application, you will most likely be using your favourite Mocking Framework such as Mockito.
  *
  *
  * keywords: ??? ,
  *
  *
  */
object AvoidCakePattern_DependencyInjection extends App{


  //1. How to define a class to encapsulate inventory services

  println("Step 1: How to define a class to encapsulate inventory services")

  class DonutInventoryService[T] {
    def checkStock(donut: T): Boolean = {
      println("DonutInventoryService->checkStock")
      true
    }
  }

  //Instead of a class, we could have used a trait. We are keeping this example simple and will make use of traits for the main facade.


  //2. How to define a class to encapsulate pricing services

  println("\nStep 2: How to define a class to encapsulate pricing services")
  class DonutPricingService[T] {
    def calculatePrice(donut: T): Double = {
      println("DonutPricingService->calculatePrice")
      2.50
    }
  }

  //Instead of a class, we could have used a trait. We are keeping this example simple and will make use of traits for the main facade.


  //3. How to define a class to encapsulate creating a donut order

  println("\nStep 3: How to define a class to encapsulate creating a donut order")
  class DonutOrderService[T] {
    def createOrder(donut: T, quantity: Int, price: Double): Int = {
      println(s"Saving donut order to database: donut = $donut, quantity = $quantity, price = $price")
      100 // the id of the booked order
    }
  }


  //4. How to define a class to encapsulate shopping cart services

  println("\nStep 4: How to define a class to encapsulate shopping cart services")
  class DonutShoppingCartService[T] (
                                      donutInventoryService: DonutInventoryService[T],
                                      donutPricingService: DonutPricingService[T],
                                      donutOrderService: DonutOrderService[T] ) {

    def bookOrder(donut: T, quantity: Int): Int = {
      println("DonutShoppingCartService->bookOrder")

      donutInventoryService.checkStock(donut) match {
        case true =>
          val price = donutPricingService.calculatePrice(donut)
          donutOrderService.createOrder(donut, quantity, price) // the id of the booked order

        case false =>
          println(s"Sorry donut $donut is out of stock!")
          -100 // return some error code to identify out of stock
      }
    }
  }


  //5. How to define a trait to encapsulate all the services for Donut store

  println("\nStep 5: How to define a trait to encapsulate all the services for Donut store")
  trait DonutStoreServices {
    val donutInventoryService = new DonutInventoryService[String]
    val donutPricingService = new DonutPricingService[String]
    val donutOrderService = new DonutOrderService[String]
    val donutShoppingCartService = new DonutShoppingCartService(donutInventoryService, donutPricingService, donutOrderService)
  }


  //6. How to define a facade to expose functionality of DonutStoreServices

  println("\nStep 6: How to define a facade to expose functionality of DonutStoreServices")
  trait DonutStoreAppController {
    this: DonutStoreServices =>

    def bookOrder(donut: String, quantity: Int): Int = {
      println("this "+this)
      println("DonutStoreAppController->bookOrder")
      donutShoppingCartService.bookOrder(donut, quantity)
    }
  }


  //DonutStoreAppController  ---> DonutStoreServices which has donutShoppingCartService --> DonutShoppingCartService (encapsulated the services eg: DonutInventoryService,
  //    DonutPricingService, DonutOrderService )


  //7. How to create a Donut store app which extends the facade with the required services
  //   we create an entry point for our donut application named DonutStoreApp which extends the DonutStoreAppController and injects the required DonutStoreServices as follows:
  println("\nStep 7: How to create a Donut store app which extends facade from Step 5 and injects the required donut services from Step 4")
  object DonutStoreApp extends DonutStoreAppController with DonutStoreServices


  //8. How to call the bookOrder method of the DonutStoreApp
  println("\nStep 8: How to call the bookOrder method of the Donut store app from Step 7")
  DonutStoreApp.bookOrder("Vanilla Donut", 10)


  //9. Test DonutStoreApp by injecting a mocked version of DonutStoreServices

  println("\nStep 9: Test DonutStoreApp by injecting a mocked version of DonutStoreServices")
  trait MockedDonutStoreServices extends DonutStoreServices {
    override val donutInventoryService: DonutInventoryService[String] = ???
    override val donutPricingService: DonutPricingService[String] = ???
    override val donutOrderService: DonutOrderService[String] = ???
    override val donutShoppingCartService: DonutShoppingCartService[String] = new DonutShoppingCartService[String](
      donutInventoryService, donutPricingService, donutOrderService)
  }

  //The mock versions for each service have no implementations by using the syntax ???
  //In a real application, you will most likely be using your favourite Mocking Framework such as Mockito.

}
