package edu.knoldus;

object UsingListOperations extends App {
  val logger = Logger.getLogger(this.getClass)
  val obj = new ListOperations
  val listOfInt = List(ONE, ONE, TWO, ZERO, SIX,FIVE, TEN)
  val listLength = obj.listLength(listOfInt)
  //val listLength=list1.foldRight(0){(n,i)=>n+1}
  logger.info(listLength)
  val subList1 = List(ONE, TWO)
  val subList2 = List(TWO, THREE)
  val subList3 = List(ONE, FIVE)
  val hasSubList = logger.info(s"sub list ${obj.hasSubsequence(listOfInt, subList1)}")

  val concatList = logger.info(obj.concatList(subList1, subList2))
  /*
   val (splitList1, splitList2) = obj.splitList(listOfInt, numBelowFive(_))
  logger.info(splitList1)
  logger.info(splitList2)

  def numBelowFive(num: Int): Boolean = {
    if (num > 5) {
      true
    }
    else {
      false
    }
  }
*/
}
