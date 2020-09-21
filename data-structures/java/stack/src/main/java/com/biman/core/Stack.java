package com.biman.core;

public class Stack {
  private int length;
  private final int[] stackArray;
  private int top;

  public Stack(int length) {
    this.length = length;
    this.stackArray = new int[length];
    this.top = -1;
  }

  public void push(int number) {
    stackArray[++length] = number;
    top = length;
  }

  public int pop() {
    return stackArray[length--];
  }

  public int peek() {
    return stackArray[length];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == length -1);
  }
}
