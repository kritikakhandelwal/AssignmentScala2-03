package edu.knoldus

import scala.collection.mutable.ListBuffer

class ListOperations {

  def listLength[A](list: List[A]): Int = list.foldRight(0)((_, n) => n + 1)

  def hasSubsequence[A](list: List[A], subList: List[A], inmatch: Boolean = false): Boolean =

    (list, subList) match {
      case (_, Nil) => true
      case (Nil, _) => false
      case (listStart :: listRemain, subListStart :: sublistRemain) if listStart == subListStart =>
        hasSubsequence(listRemain, sublistRemain, true) || hasSubsequence(list, subList)
      case _ =>
        inmatch && hasSubsequence(list.tail, subList)

    }

  def concatList[A](list1: List[A], list2: List[A]): List[A] = {

    (list1, list2) match {
      case (_, Nil) => list1
      case (Nil, _) => list2
      case (list1, list2Start :: list2Tail) => concatList(list1 :+ list2Start, list2Tail)
    }
  }

  /*
    def splitList[A](list: List[A], f: A => Boolean): (List[A], List[A]) = {
      val resultListAfterSplit = List()[A]
      f match {
        case list1Start :: list1Tail  if (f(list1Start))=> resultListAfterSplit :+ list1Start
        case list1Start :: list1Tail  if (!f(list1Start))=> splitList(list1Tail)

      }

    }
    */


}
