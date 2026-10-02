/*
Question:
Calculate Compound Interest.

Formula:
Amount = P * (1 + R/100)^T
Compound Interest = Amount - P
*/

import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble(); // Principal
        double r = sc.nextDouble(); // Rate
        double t = sc.nextDouble(); // Time

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Amount = " + amount);

        sc.close();
    }
}