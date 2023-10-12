package com.softdevco;

import java.io.*;

/**
 * simulates InputStream and OutputStream for testing
 */
public class StreamSimulator {
  /**
   * sets input for system.in
   */
  public static void systemSetIn(){
    byte[][] arr = new byte[][]{{97,98,99,100}, {97,98,13,99,100}, {97,98,10,99,100}, {97,98,13,100}, {97,13,10,10,98}, {97,13,13,98},{}};
    System.setIn(new ByteArrayInputStream(arr[3]));
  }
  /**
   *
   * @return InputStream instance
   */
  public static InputStream getInputStream() {
    byte[] data = {48, 49, 50, 51, 126};
    return new ByteArrayInputStream(data);
  }

  /**
   *
   * @return bytes array
   */
  public static byte[] getOutputStreamAsByteArray() {
    ByteArrayOutputStream outputStream =
      new ByteArrayOutputStream();
    return outputStream.toByteArray();
  }
}
