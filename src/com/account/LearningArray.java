package com.account;

public class LearningArray {
    public static void main(String[] args) {
        int [] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter != 7 && counter != 9)
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
