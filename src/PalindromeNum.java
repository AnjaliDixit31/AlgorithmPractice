import java.util.Scanner;

public class PalindromeNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        int number = sc.nextInt();
        int copy = number;
        int riv = 0;
        while (number>0) {
            int rem = number % 10;
            riv = riv * 10 + rem;
            number = number/10;
        }
        if (riv == copy){
            System.out.println(riv+ "-- is a palindrome number");
        }else
            System.out.println(riv+ " -- is not a palindrome number");
    }
}
