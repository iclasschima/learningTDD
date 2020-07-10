package com.account;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {

        Random random = new Random();
        int [] counter = new int [11];
        int [] diceSum = {2,3,4,5,6,7,8,9,10,11,12};
        int count = 2;
        int sum;

        for (int i = 1; i <= 36000000; i++) {
            sum = (1 + random.nextInt(6)) + (1 + random.nextInt(6));

            for (int dice = 0; dice < diceSum.length; dice++) if (sum == diceSum[dice]) counter[dice]++;
        }

        System.out.println("Number      NumOfTimes");

        for (int number : counter)
            System.out.printf("%3d %16d%n", count++, number);

    }
}
