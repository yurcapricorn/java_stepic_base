package com.softdevco;

import java.util.*;
import java.util.function.*;

/**
 * class for stepic collections task 2
 */
public class Main {
  /**
   * prints even reverse int from System.in to System.out
   * @param args no args needed
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int i = 0;
    while (scanner.hasNext()) {
      if (i % 2 == 0) {
        scanner.next();
        i++;
        continue;
      }
      try {
        list.add(scanner.nextInt());
        i++;
      } catch (Exception e) {
        if (scanner.hasNext()) {
          scanner.next();
          i++;
        }
      }
    }
    Collections.reverse(list);
    for (Integer num : list
      ) {
      System.out.printf(" %d", num);
    }
  }
}