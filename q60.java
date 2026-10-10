// Q60. Write a Java program to print the Fibonacci series.

public class q60 {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}