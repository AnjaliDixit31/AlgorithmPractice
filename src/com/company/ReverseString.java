package com.company;

public class ReverseString {
    public void reverseString(char[] input) {
        int start = 0;
        int end = input.length - 1;
        while(start < end){
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
