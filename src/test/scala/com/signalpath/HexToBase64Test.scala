package com.signalpath

import org.scalatest.{Matchers, FlatSpec}

class HexToBase64Test extends FlatSpec with Matchers {
  private lazy val Valid = new {
    val hex = "45766964696e74"
    val base64 = "RXZpZGludA=="
  }
  private lazy val InvalidHex = "Q"

  "convert" should "take a valid hexadecimal string and return a base64 string" in {
    HexToBase64.convert(Valid.hex) should be (Valid.base64)
  }

  it should "throw a generic Exception when hexidecimal parsing fails" in {
    a [Exception] should be thrownBy {
      HexToBase64.convert(InvalidHex)
    }
  }

  it should "throw ArrayIndexOutOfBoundsException if no args are passed" in {
    a [ArrayIndexOutOfBoundsException] should be thrownBy {
      HexToBase64.parseArg(Array[String]())
    }
  }
}
