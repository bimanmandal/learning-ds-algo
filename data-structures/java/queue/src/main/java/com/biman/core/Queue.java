package com.biman.core;

public class Queue {

  Node front;
  Node rear;

  public Queue() {
    this.front = this.rear = null;
  }

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  boolean isEmpty() {
    return  this.front == null;
  }

  void insert(int data) {
    Node newNode = new Node(data);
    if(isEmpty()) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
      if(front.next == null) {
        front.next = rear;
      }
    }
  }

  void delete() {
    if(isEmpty()) {
      System.out.println("Empty Queue. Unable to delete");
      return;
    } else if (front == rear) {
      front = rear = null;
    } else front = front.next;
    System.out.println("deleted");
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Empty Queue. Unable to Display");
      return;
    }
    Node current = front;
    while (current!= null) {
      System.out.print(String.format("%s ", current.data));
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.insert(10);
    queue.insert(11);
    queue.display();
    queue.delete();
    queue.display();
    queue.insert(12);
    queue.insert(13);
    queue.insert(14);
    queue.insert(15);
    queue.display();
    queue.delete();
    queue.delete();
    queue.delete();
    queue.delete();
    queue.display();
    queue.insert(16);
    queue.insert(17);
    queue.insert(18);
    queue.delete();
    queue.display();
  }
}
