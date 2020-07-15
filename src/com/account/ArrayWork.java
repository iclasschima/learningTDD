package com.account;
import java.util.Scanner;

public class ArrayWork {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // No. 1
        int[][] t = new int [2][3];

        // No. 2 - t has 2 rows

        // No. 3 - t has 3 cols

        // No. 4 - t has 6 elements

        // No. 5
        System.out.println(t[0][0]);
        System.out.println(t[0][1]);
        System.out.println(t[0][2]);

        // No. 6
        System.out.println(t[1][0]);
        System.out.println(t[1][1]);
        System.out.println(t[1][2]);

        // No. 7
        t[0][1] = 0;

        // No. 8
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        // No. 9
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++)
                t[row][col] = 0;
        }

        // No. 10
//        for (int row = 0; row < t.length; row++) {
//            for (int col = 0; col < t[row].length; col++) {
//                System.out.println("Entering values for row " + (row + 1) + " col " + (col + 1));
//                t[row][col] = input.nextInt();
//            }
//        }

        // No. 11.
        int smallestValue;

        smallestValue = t[0][0];
        smallestValue = Math.min(smallestValue, t[0][1]);
        smallestValue = Math.min(smallestValue, t[0][2]);
        smallestValue = Math.min(smallestValue, t[1][0]);
        smallestValue = Math.min(smallestValue, t[1][1]);
        smallestValue = Math.min(smallestValue, t[1][2]);

        System.out.println("smallest value: " + smallestValue);

        // No. 12
        System.out.printf("%d %1d %1d\n", t[0][0], t[0][1], t[0][2]);

        // No. 13
        int total = t[0][2] + t[1][2];

        // No. 14
        System.out.println("\nArrays values in tabular format");
        System.out.println("     [0]  [1]  [2]");
        System.out.printf("[0] %3d %4d %4d\n", t[0][0], t[0][1], t[0][2]);
        System.out.printf("[1] %3d %4d %4d\n", t[1][0], t[1][1], t[1][2]);
    }
}
