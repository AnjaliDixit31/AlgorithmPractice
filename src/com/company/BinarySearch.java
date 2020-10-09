package com.company;

public class BinarySearch {
        public static void main(String[] args) {
            int[] array = new int[]{10,20,30,40,50};
            int search=10;
            int foundIndex=binarySearch(array, search);
            if(foundIndex==-1)
                System.out.println("Element not found");
            else
                System.out.println("Element present in " +foundIndex+" index ");

        }
        static int binarySearch(int[] array, int search)
        {
            int low=0;
            int high=array.length-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(search==array[mid])
                {
                    return mid;
                }
                if(search<array[mid]){
                    high=mid-1;}
                if(search>array[mid])
                    low=mid+1;
            }
            return-1;
        }
    }
