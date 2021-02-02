package com.biman.core;

import com.github.afkbrb.btp.BTPrinter;

import java.util.*;

public class ApplicationMain {
  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(11);
    Node c = new Node(12);
    Node d = new Node(13);
    Node e = new Node(14);
    Node f = new Node(15);
    Node g = new Node(16);
    Node h = new Node(17);


    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    f.left = g;
    g.right = h;

    System.out.println(TreePrinter.getTreeDisplay(a));
//    BTPrinter.printRandomBST(100, 100);

    breadthFirstTraversal(a);
    depthFirstTraversal(a);
  }

  static void breadthFirstTraversal(Node root) {
    Queue<Node> nodeQueue = new LinkedList<>();
    nodeQueue.add(root);
    while (nodeQueue.peek() != null ) {
      Node head = nodeQueue.peek();
      System.out.print(head.data + " ");
      nodeQueue.remove();
      if(head.left!= null)
        nodeQueue.add(head.left);
      if(head.right!= null)
        nodeQueue.add(head.right);
    }
  }

  static void depthFirstTraversal(Node root) {
    Stack<Node> nodeStack = new Stack<>();
    nodeStack.push(root);
    while (!nodeStack.isEmpty()) {
      Node head = nodeStack.peek();
      System.out.print(head.data + " ");
      nodeStack.pop();
      if(head.right!= null)
        nodeStack.push(head.right);
      if(head.left!= null)
        nodeStack.push(head.left);
    }
  }


}
