package com.softdevco;

import java.util.Scanner;

/**
 * unit 5.3 java Stepic basic course task2
 */
public class Main {
    /**
     *
     * @param args uses System.in for input data
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dbl = 0;
        while (scanner.hasNext()) {
            try {
                dbl += scanner.nextDouble();
            } catch (Exception e) {
                if (scanner.hasNext()) {
                    scanner.next();
                }
            }
        }
        System.out.printf("%.6f", dbl);
        System.out.close();
    }
}