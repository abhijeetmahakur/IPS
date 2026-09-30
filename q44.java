// Q44. Write a Java program to find the HCF of two numbers using the Euclidean method.

import java.util.Scanner;

class Q44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println("HCF = " + a);
    }
}