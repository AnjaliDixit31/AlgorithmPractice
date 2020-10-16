package com.company;

import java.util.Scanner;

public class CountDigits {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = sc.nextInt();
        int count = 0;
        while (number>0){
            count++;
            number = number/10;
        }
        System.out.println("Total number of the input digits : " +count);
    }
}
