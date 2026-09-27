// Q18. Write a Java program to find the frequency of a digit in a number n.

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int digit = sc.nextInt();
        int frequency = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit == digit) {
                frequency++;
            }

            n = n / 10;
        }

        System.out.println("Frequency = " + frequency);
    }
}