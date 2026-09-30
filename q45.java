// Q45. Write a Java program to check whether a number is an Armstrong number or not.

import java.util.Scanner;

class Q45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int digits = 0;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        // Calculate Armstrong sum
        while (temp != 0) {
            int rem = temp % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}