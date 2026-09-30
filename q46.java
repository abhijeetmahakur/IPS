// Q46. Write a Java program to check whether a number is a Perfect Number or not.

import java.util.Scanner;

class Q46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Find all proper divisors
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
    }
}