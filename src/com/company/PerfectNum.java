package com.company;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter any number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=number/2 ; i++){
            if (number%i == 0){
                sum = sum + i;
                //System.out.println(i);
            }
        }
        if (sum == number){
            System.out.println(number+ " is perfect number");
        }else System.out.println(number+ " is not a perfect number");
    }
}
