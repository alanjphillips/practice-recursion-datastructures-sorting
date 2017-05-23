package binarytree

// Taken from Github user: schmmd

trait Tree[+T]

case object Empty extends Tree[Nothing]

case class Node[T](elem: T, left: Tree[T], right: Tree[T]) extends Tree[T]

object Tree {

  def preOrderList[T](t: Tree[T]): List[T] = t match {
    case Empty => Nil
    case Node(e, left, right) => e :: preOrderList(left) ::: preOrderList(right)
  }

  def postOrderList[T](t: Tree[T]): List[T] = t match {
    case Empty => Nil
    case Node(e, left, right) => postOrderList(left) ::: postOrderList(right) ::: List(e)
  }

  def inOrderList[T](t: Tree[T]): List[T] = t match {
    case Empty => Nil
    case Node(e, left, right) => inOrderList(left) ::: List(e) ::: inOrderList(right)
  }

  def size[T](t: Tree[T]): Int = t match {
    case Empty => 0
    case Node(e, left, right) => 1 + size(left) + size(right)
  }

  def leafCount[T](t: Tree[T]): Int = t match {
    case Empty => 0
    case Node(e, Empty, Empty) => 1
    case Node(e, left, right) => leafCount(left) + leafCount(right)
  }

  def leaves[T](t: Tree[T]): List[T] = t match {
    case Empty => Nil
    case Node(e, Empty, Empty) => List(e)
    case Node(e, left, right) => leaves(left) ::: leaves(right)
  }

  def height[T](t: Tree[T]): Int = t match {
    case Empty => 0
    case Node(e, left, right) => 1 + math.max(height(left), height(right))
  }

}