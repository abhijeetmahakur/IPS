// Q59. Write a Java program to generate a colour sequence
// in reverse order using backtracking and count the steps.

public class q59 {
    static int steps = 0;
    static String[] colors = {"Red", "Green", "Blue"};

    static void generate(int n) {
        if (n == 0)
            return;

        steps++;
        System.out.print(colors[(n - 1) % colors.length] + " ");
        generate(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("Reverse colour sequence: ");
        generate(n);

        System.out.println("\nNumber of steps: " + steps);
    }
}