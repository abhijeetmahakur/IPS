// Q48. Write a Java program to check whether a number is a Niven Number or not.

import java.util.Scanner;

class q48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        // Find sum of digits
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        // Check whether number is divisible by sum of digits
        if (n % sum == 0) {
            System.out.println(n + " is a Niven Number.");
        } else {
            System.out.println(n + " is not a Niven Number.");
        }
    }
}