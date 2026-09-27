// Q15. Write a Java program to count the even and odd digits of a number.

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }
}