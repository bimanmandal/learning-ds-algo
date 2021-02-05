package com.biman.feb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HarmonicSequence {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
    System.out.println(findLongestHarmonicSequence1(nums));
    System.out.println(findLongestHarmonicSequence(nums));
  }

  // [ 1, 2, 2, 2, 3, 3, 5, 7 ]
  // L = 0
  // R = 2
  // Result = 3
  // diff = 1

  public static int findLongestHarmonicSequence1(int[] nums) {
    Arrays.sort(nums);
    int left = 0;
    int right = 1;
    int result = 0;
    while (right < nums.length) {
      int diff = nums[right] - nums[left];
      if(diff > 1) {
        left ++;
      } else {
        right ++;
      }

      if (diff <= 1) {
        result = Math.max(result, right - left );
      }
    }

    return result;
  }

  public static int findLongestHarmonicSequence(int[] nums) {
    int result = 0;
    Map<Integer, Integer> counts = new HashMap<>();
    for(int i : nums) {
      counts.put(i, counts.getOrDefault(i, 0) + 1);
    }
    for(int i : counts.keySet()) {
      if(counts.containsKey(i + 1)) {
        result = Math.max(result, counts.get(i) + counts.get(i + 1));
      }
    }

    return result;

  }
}
