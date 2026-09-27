// Q12. Write a Java program to find the first and last digit of a number.

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Find last digit
        int lastDigit = n % 10;

        // Find first digit
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}