// Q17. Write a Java program to find the smallest digit in a number.

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int smallest = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit < smallest) {
                smallest = digit;
            }

            n = n / 10;
        }

        System.out.println("Smallest digit = " + smallest);
    }
}