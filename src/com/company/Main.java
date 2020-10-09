package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Anjali Dixit";
        char[] inputCharArray = s.toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(inputCharArray);
        System.out.println("Reversed String: " + new String(inputCharArray));
    }
}
