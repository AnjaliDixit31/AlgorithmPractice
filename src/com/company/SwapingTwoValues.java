package com.company;

import java.util.Scanner;

public class SwapingTwoValues {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first digit : ");
        int firstDigit = sc.nextInt();
        System.out.print("Enter second digit : ");
        int secondDigit = sc.nextInt();
        firstDigit = firstDigit + secondDigit;
        secondDigit = firstDigit - secondDigit;
        firstDigit = firstDigit - secondDigit;
        System.out.println("First digit after swapping : " +firstDigit);
        System.out.println("Second digit after swapping : " +secondDigit);
    }
}
