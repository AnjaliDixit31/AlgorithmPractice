package com.company;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String args[]){
        //int number = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = sc.nextInt();
        while (number > 0){
            int rem = number % 10;
            System.out.print(rem);
            number = number / 10;
        }
    }
}
