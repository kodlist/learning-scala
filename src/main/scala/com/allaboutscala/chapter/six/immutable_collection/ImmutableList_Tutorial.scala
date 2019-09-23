package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  *
  *  Immutable List and perform common operations such as initialization, appending or prepending elements and accessing elements within the List.
  *
  *   More advanced functions such as aggregate, fold, reduce, map, flatMap etc on the Immutable List will be discussed in Chapter 8 on Collection Functions.
  *
  *
  *   keywords: for append use ':+' , ${list1(0)}  , for prepend use '+:' , combine two lists use '::', combine two lists use ':::'
  *
  *
  */

object ImmutableList_Tutorial extends App{




    //1. How to initialize an immutable List with 3 elements


    println("Step 1: How to initialize an immutable List with 3 elements")
    val list1: List[String] = List("Plain Donut", "Strawberry Donut", "Chocolate Donut")
    println(s"Elements of list1 = $list1")


    //2. How to access elements of immutable List at specific index

    println("\nStep 2: How to access elements of immutable List at specific index")
    println(s"Element at index 0 = ${list1(0)}")
    println(s"Element at index 1 = ${list1(1)}")
    println(s"Element at index 2 = ${list1(2)}")


    //diff btw tuple vs list

    println("\nDiff btw tuple vs list: Using TupleN classes to store more than 2 data points")
    val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
    println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")


    //3. How to append elements at the end of immutable List using :+

    println("\nStep 3: How to append elements at the end of immutable List using :+")
    val list2: List[String] = list1 :+ "Vanilla Donut"
    println(s"Append elements at the end using :+ = $list2")


    //4. How to prepend elements at the front of immutable List using +:

    println("\nStep 4: How to prepend elements at the front of immutable List using +:")
    val list3: List[String] = "Vanilla Donut" +: list1
    println(s"Prepend elements at the front using +: = $list3")


    //5. How to add two immutable lists together using ::

    println("\nStep 5: How to add two immutable lists together using ::")
    val list4: List[Any] = list1 :: list2
    println(s"Add two lists together using :: = $list4")

    //Using :: returns a new List(List(...), elements from the second list)


    //6. How to add two immutable Lists together using :::

    println("\nStep 6: How to add two immutable Lists together using :::")
    val list5: List[String] = list1 ::: list2
    println(s"Add two lists together using ::: = $list5")


    //7. How to initialize an empty immutable List

    println("\nStep 7: How to initialize an empty immutable List")
    val emptyList: List[String] = List.empty[String]
    println(s"Empty list = $emptyList")



    println("\nStep 8: How to remove elements ")
    /*val list8: Boolean = list1.remove("Chocolate Donut")
    println(s"Append elements at the end using :+ = $list8")
  */



}
