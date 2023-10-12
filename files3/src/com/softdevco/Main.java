package com.softdevco;

import java.io.*;
import java.nio.charset.Charset;

public class Main {

  public static void main(String[] args) throws IOException {

    readAsString(StreamSimulator.getInputStream(), Charset.forName("ASCII"));
  }

  static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    InputStreamReader reader = new InputStreamReader (inputStream , charset);
    StringBuilder string = new StringBuilder();
    char[] x = new char[1];
    while (reader.read(x) != -1) {
      System.out.println(x);
      string.append(x);
    }
    return string.toString();
  }
}
