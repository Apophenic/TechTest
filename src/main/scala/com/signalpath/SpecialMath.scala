package com.signalpath

object SpecialMath {
  var memoMap: Map[Int, Long] = Map()

  def main(args: Array[String]) {
    try {
      println(doMath(parseArg(args)))
    } catch {
      case e: NumberFormatException =>
        println("Failed to parse string arg to int. Exiting...")
        return
    }
  }

  @throws(classOf[NumberFormatException])
  def parseArg(args: Array[String]): Int = {
    args(0).toInt
  }

  def doMath(arg: Int): Long = {
    if (arg <= 0) {
      return 0
    } else if (arg == 1) {
      return 1
    }
    
    if (memoMap.contains(arg)) {
      memoMap.get(arg).get
    } else {
      val value = arg + doMath(arg - 1) + doMath(arg - 2)
      memoMap += arg -> value
      value
    }
  }
}
