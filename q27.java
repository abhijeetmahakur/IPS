// Q27. Write a Java program to print:
// 1
// 232
// 34543
// 4567654
// 567898765

class Q27 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            int start = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start++;
            }

            start -= 2;

            for (int j = 1; j < i; j++) {
                System.out.print(start);
                start--;
            }

            System.out.println();
        }
    }
}
