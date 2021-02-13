package com.biman.feb;

import java.util.Arrays;

public class ValidAnagrams {

  public static void main(String[] args) {

    for(char c: "hello india".toCharArray()) {
      System.out.println(c);
      System.out.println( c - 'a');
    }

  }

  public static boolean isanagrams(String s, String t) {
    if(s.length() != t.length()) return false;
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    Arrays.sort(sArray);
    Arrays.sort(tArray);

     return Arrays.equals(sArray, tArray);
  }

  public static boolean isAnagrams(String s, String t) {
    if(s.length()!= t.length()) return false;
    int[] cnt = new int[26];

    for (char c: s.toCharArray()) {
      cnt[c - 'a']++;
    }

    for (char c: t.toCharArray()) {
      if (cnt[c - 'a'] == 0) return false;
      cnt[c - 'a']--;
    }

    return true;
  }
}
