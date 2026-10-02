/*
Question:
WAP to find the mean and median of the array elements.
*/

import java.util.Arrays;
import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Mean
        double mean = (double) sum / n;

        // Sort the array for finding median
        Arrays.sort(arr);

        double median;

        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            median = arr[n / 2];
        }

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);

        sc.close();
    }
}