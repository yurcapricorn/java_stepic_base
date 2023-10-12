package com.softdevco;

import java.util.stream.IntStream;


public class Main {

  public static IntStream pseudoRandomStream(int seed) {
    return IntStream.iterate(seed, n -> seed % (10 * n) * (n * 2 + 1))
      .peek(System.out::println);
  }
}

