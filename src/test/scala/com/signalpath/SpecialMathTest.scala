package com.signalpath

import org.scalatest.{Matchers, FlatSpec}

class SpecialMathTest extends FlatSpec with Matchers {
  private lazy val ValidOne = new {
    val in = 7
    val out = 79
  }
  private lazy val ValidTwo = new {
    val in = 17
    val out = 10926
  }

  "doMath" should "return the proper output given 7 as the input" in {
    SpecialMath.doMath(ValidOne.in) should be (ValidOne.out)
  }

  it should "return the proper output given 17 as the input" in {
    SpecialMath.doMath(ValidTwo.in) should be (ValidTwo.out)
  }

  it should "return 0 if the input arg is 0" in {
    SpecialMath.doMath(0) should be (0)
  }

  it should "return 0 if the input arg is negative" in {
    SpecialMath.doMath(-8765309) should be (0)
  }

  it should "return 1 if the input arg is 1" in {
    SpecialMath.doMath(1) should be (1)
  }

  it should "throw a NumberFormatException when a non-numeric string is passed as an arg" in {
    a [NumberFormatException] should be thrownBy {
      SpecialMath.parseArg(Array[String]("banana_pancakes"))
    }
  }
}
