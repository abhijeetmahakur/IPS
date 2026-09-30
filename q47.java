// Q47. Write a Java program to check whether a number is a Strong Number or not.

import java.util.Scanner;

class Q47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp != 0) {

            int rem = temp % 10;

            // Find factorial of digit
            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }
    }
}
