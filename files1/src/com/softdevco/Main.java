package com.softdevco;

import java.io.IOException;
import java.io.InputStream;

/**
 * main files1 class
 */
public class Main {
  /**
   * prints checksum of InputStream data
   *
   * @param args - no args needed
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    InputStream inputStream = StreamSimulator.getInputStream();
    int totalBytesRead = 0;
    byte[] buff = new byte[1];
    int checksum = 0;
    int blockSize;
    while ((blockSize = inputStream.read(buff)) > 0) {
      totalBytesRead += blockSize;
      checksum = Integer.rotateLeft(checksum, 1) ^ Byte.toUnsignedInt(buff[0]);
    }
    System.out.println(checksum);
    System.out.println(totalBytesRead);

  }
}
