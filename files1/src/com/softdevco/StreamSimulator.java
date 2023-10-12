package com.softdevco;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * simulates InputStream and OutputStream for testing
 */
public class StreamSimulator {
  /**
   *
   * @return InputStream instance
   */
  public static InputStream getInputStream() {
    byte[] data = {0x33, 0x45, 0x01};
    return new ByteArrayInputStream(data);
  }

  /**
   *
   * @return bytes array
   */
  public static byte[] getOutputStream() {
    ByteArrayOutputStream outputStream =
      new ByteArrayOutputStream();
    return outputStream.toByteArray();
  }
}
