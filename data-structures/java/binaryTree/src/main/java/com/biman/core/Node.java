package com.biman.core;

public class Node implements TreePrinter.PrintableNode {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    return String.valueOf(data);
  }

  @Override
  public TreePrinter.PrintableNode getLeft() {
    return left;
  }

  @Override
  public TreePrinter.PrintableNode getRight() {
    return right;
  }

  @Override
  public String getText() {
    return toString();
  }
}
