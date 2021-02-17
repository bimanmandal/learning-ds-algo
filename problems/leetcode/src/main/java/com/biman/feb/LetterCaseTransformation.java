package com.biman.feb;

import java.util.LinkedList;
import java.util.List;

public class LetterCaseTransformation {

  public List<String> letterCasePermutation(String S) {
    LinkedList<String> result = new LinkedList<>();
    result.add(S);
    int n = S.length();

    for(int i = n - 1; i >= 0; i--) {
      char c = S.charAt(i);
      if(Character.isLetter(c)) {
        int size = result.size();
        while (size-- > 0) {
          String s = result.poll();
          String left = s.substring(0, i);
          String right = s.substring(i + 1, n);
          result.add(left + Character.toUpperCase(c) + right);
          result.add(left + Character.toLowerCase(c) + right);
        }
      }
    }
    return result;
  }
}
