package com.signalpath

object SpecialMath {
  def main(args: Array[String]) {
    try {
      println(doMath(parse(args)))
    } catch {
      case e: NumberFormatException =>
        println("Failed to parse string arg to int. Exiting...")
        return
    }
  }

  @throws(classOf[NumberFormatException])
  def parse(args: Array[String]): Integer = {
    args(0).toInt
  }

  def doMath(arg: Integer): Integer = {
    // <= 0 to avoid StackOverflowExceptions when a negative int is passed
    if (arg <= 0) {
      return 0
    } else if (arg == 1) {
      return 1
    }
    arg + doMath(arg - 1) + doMath(arg - 2)
  }
}
