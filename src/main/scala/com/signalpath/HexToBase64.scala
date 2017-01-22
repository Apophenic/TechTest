package com.signalpath

import org.apache.commons.codec.binary.{Hex, Base64}

object HexToBase64 {
  def main(args: Array[String]) {
    try {
      println(convert(parseArg(args)))
    } catch {
      case e: ArrayIndexOutOfBoundsException =>
        println("No CLI arguments found. Exiting...")
        return
      case e: Exception =>
        println("Error parsing hexidecimal string. Exiting...")
        return
    }
  }

  @throws(classOf[ArrayIndexOutOfBoundsException])
  def parseArg(args: Array[String]) : String = {
    args(0)
  }

  @throws(classOf[Exception])
  def convert(arg: String): String = {
    val hexStringBytes = Hex.decodeHex(arg.toCharArray)
    new String(Base64.encodeBase64(hexStringBytes))
  }
}
