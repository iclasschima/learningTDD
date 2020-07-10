package com.account;

public class MultiArray {

    public static void updateArray (int array) {
        System.out.println(array);
    }

    public static void main(String[] args) {
        int[][] array = {
                {2,4,5},
                {3,1,7,9},
                {7, 9},
                {3,10,4,2}
        };


        MultiArray.updateArray(array[0][2]);


        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
    }
}
