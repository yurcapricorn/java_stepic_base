package com.softdevco;

import java.io.*;

/**
 * main files2 class
 */
public class Main {
    /**
     * prints checksum of InputStream data
     *
     * @param args - no args needed
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        StreamSimulator.systemSetIn();
        boolean wasSymbolR = false;
        int x;
        while ((x = System.in.read()) != -1) {
            if (wasSymbolR == true) {
                if (x == 10) {
                    System.out.write(x);
                    wasSymbolR = false;
                    continue;
                } else {
                    System.out.write(13);
                }
            }
            if (x == 13) {
                wasSymbolR = true;
                continue;
            }
            System.out.write(x);
            wasSymbolR = false;
        }
        System.out.flush();
        System.out.close();
    }
}
