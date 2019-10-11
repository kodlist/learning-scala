package com.allaboutscala.unittest_two

/**
  * Created by mkoduri on 10/9/2019.
  *
  *
  * For teams coming from Ruby's RSpec tool, FunSpec will feel very familiar; More generally,
  * for any team that prefers BDD, FunSpec's nesting and gentle guide to structuring text (with describe and it) provides
  * an excellent general-purpose choice for writing specification-style tests.
  *
  *
  */



import org.scalatest.FunSpec


class SetSpec_A FunSpec {

  describe("A Set") {
  describe("when empty") {
  it("should have size 0") {
  assert(Set.empty.size == 0)
}

  it("should produce NoSuchElementException when head is invoked") {
  assertThrows[NoSuchElementException] {
  Set.empty.head
}
}
}
}
}
