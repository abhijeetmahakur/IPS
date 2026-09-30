// Q49. Write a Java program to check whether a number is an Automorphic Number or not.

import java.util.Scanner;

class Q49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int divisor = 1;

        // Find number of digits
        while (temp != 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        // Check whether last digits of square are equal to number
        if (square % divisor == n) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }
    }
}