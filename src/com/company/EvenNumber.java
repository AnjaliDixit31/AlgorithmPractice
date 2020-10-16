package com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = sc.nextInt();
        if (number == 0){
            System.out.println( number+" is not even number");}
        else if(number % 2 == 0){
            System.out.println(number+" is even number");
        }else
               System.out.println(number+" is a odd number");

    }
}
