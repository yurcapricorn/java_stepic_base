package com.softdevco;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

  }

  /**
   * required method
   * @param set1
   * @param set2
   * @param <T>
   * @return
   */
  public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> result = new HashSet<>();
    for (T element : set1
      ) {
      if (!set2.contains(element)) {
        result.add(element);
      }
    }
    for (T element : set2
      ) {
      if (!set1.contains(element)) {
        result.add(element);
      }
    }
    return result;
  }
}
