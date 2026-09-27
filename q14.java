// Q14. Write a Java program to find the product of all the digits of a number.

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.println("Product = " + product);
    }
}