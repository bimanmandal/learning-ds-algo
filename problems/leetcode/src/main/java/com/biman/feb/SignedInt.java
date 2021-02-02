package com.biman.feb;

public class SignedInt {
  public static void main(String[] args) {
    System.out.println(hammigWeight(-5));

  }

  public static int hammigWeight(int n) {
    int count = 0;
    while (n != 0) {
      n &= (n - 1);
      count ++;
    }
    return count;
  }
}
