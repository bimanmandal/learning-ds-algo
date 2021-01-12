package com.biman.core;

public class SinglyLinkedList {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addNewNode(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void display() {
    Node current = head;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    while (current != null) {
      System.out.printf("%s ", current.data);
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addNewNode(10);
    list.addNewNode(11);
    list.addNewNode(12);
    list.addNewNode(13);
    list.addNewNode(14);

    list.display();
  }


}
