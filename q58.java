// Q58. Write a Java program to generate a colour sequence
// given a positive integer n and count the number of steps.

public class q58 {
    public static void main(String[] args) {
        int n = 5;
        int steps = 0;

        String[] colors = {"Red", "Green", "Blue"};

        System.out.print("Colour sequence: ");

        for (int i = 0; i < n; i++) {
            System.out.print(colors[i % 3] + " ");
            steps++;
        }

        System.out.println("\nNumber of steps: " + steps);
    }
}