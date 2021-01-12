package com.biman.core;

public class StackAsLinkedList {

  Node root;

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void pushData(int data) {
    Node newNode = new Node(data);

    if(isEmpty()){
      root = newNode;
    } else {
      Node temp = root;
      root = newNode;
      root.next = temp;
    }

    System.out.println("Pushed to stack " + data);
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("Empty List");
    } else {
      System.out.println("Popped: " + root.data);
      root = root.next;
    }
  }


  public static void main(String[] args) {
    StackAsLinkedList stack = new StackAsLinkedList();
    stack.pushData(10);
    stack.pushData(11);
    stack.pushData(12);
    stack.pushData(13);
    stack.pop();
    stack.pushData(14);
    stack.pushData(15);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pushData(16);
    stack.pushData(10);
  }

}
