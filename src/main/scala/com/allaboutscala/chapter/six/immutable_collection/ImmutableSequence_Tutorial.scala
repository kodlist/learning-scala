package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  *
  * Sequence is a trait and if you look carefully in the console window for Step 1 above,
  * the elements of the Sequence were rendered into a concrete Immutable List.
  *
  */
object ImmutableSequence_Tutorial extends App{

  //1. How to initialize a Sequence with 3 elements

  println("Step 1: How to initialize a Sequence with 3 elements")
  val seq1: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of seq1 = $seq1")

  //2. How to access elements in Sequence at specific index

  println("\nStep 2: How to access elements in Sequence at specific index")
  println(s"Element at index 0 = ${seq1(0)}")
  println(s"Element at index 1 = ${seq1(1)}")
  println(s"Element at index 2 = ${seq1(2)}")

  //3. How to add elements to Sequence using :+

  println("\nStep 3: How to add elements to Sequence using :+")
  val seq2: Seq[String] = seq1 :+ "Vanilla Donut"
  println(s"Adding elements to Sequence using :+ = $seq2")

  //4. How to add two Sequence together using ++

  println("\nStep 4: How to add two Sequence together using ++")
  val seq3: Seq[String] = seq1 ++ Seq[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two sequences together using ++ = $seq3")

  //5. How to initialize an empty Sequence

  println("\nStep 5: How to initialize an empty Sequence")
  val emptySeq: Seq[String] = Seq.empty[String]
  println(s"Empty Sequence = $emptySeq")



}
