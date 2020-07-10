package com.account;
import java.util.Scanner;

public class AirlineReservation {

    public static void main(String[] args) {
        boolean[] seats = new boolean[10];
        Scanner input = new Scanner(System.in);
        int response;
        int economySeatsCount = 1;
        int firstClassSeatsCount = 1;


        while (true) {
            System.out.print("Please enter 1 for FIRST-CLASS or Enter 2 for ECONOMY or 0 to quit: ");
            response = input.nextInt();

            if (response == 0) break;

            if (response == 1) {
                for (int i = 0; i < 5; i++ ) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        firstClassSeatsCount++;
                        System.out.printf("Your seat number is: %d [FIRST-CLASS] %n", i + 1);
                        break;
                    }
                    if (firstClassSeatsCount > 5) {
                        System.out.println("FIRST-CLASS section is full. Enter 2 to be placed in ECONOMY section");
                        break;
                    }
                }
            }
            else if (response == 2) {
                for (int i = 5; i < 10; i++) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        economySeatsCount++;
                        System.out.printf("Your seat number is: %d [ECONOMY] %n", i + 1);
                        break;
                    }
                    if (economySeatsCount > 5) {
                        System.out.println("ECONOMY section is full. Enter 1 to be placed in FIRST-CLASS section");
                        break;
                    }
                }
            }

            if (economySeatsCount > 5 && firstClassSeatsCount > 5) {
                System.out.println("Both sections are full");
                break;
            }
        }
    }
}
