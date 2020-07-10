package com.account;
import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        int [] counters = new int[9];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the gross amount: ");

        int amount;
        double commission;
        int salary;

        while(true) {
            amount = input.nextInt();

            if (amount < 0) {
                break;
            }
            
            commission = 0.09 * amount;
            salary = 200 + (int) commission;

            if (salary < 300) {
                counters[0]++;
            }
            else if(salary < 400){
                counters[1]++;
            }
            else if(salary < 500){
                counters[2]++;
            }
            else if(salary < 600){
                counters[3]++;
            }
            else if(salary < 700){
                counters[4]++;
            }
            else if(salary < 800){
                counters[5]++;
            }
            else if(salary < 900){
                counters[6]++;
            }
            else if(salary < 1000){
                counters[7]++;
            }
            else {
                counters[8]++;
            }

//            System.out.println(salary);

//            System.out.println/(commission);
            System.out.println("Enter gross amount again or -1 to quit: ");
        }

        System.out.println("Range       Number of Times");
        System.out.println("a           " + counters[0]);
        System.out.println("b           " + counters[1]);
        System.out.println("c           " + counters[2]);
        System.out.println("d           " + counters[3]);
        System.out.println("e           " + counters[4]);
        System.out.println("f           " + counters[5]);
        System.out.println("g           " + counters[6]);
        System.out.println("h           " + counters[7]);
        System.out.println("i           " + counters[8]);




    }
}

