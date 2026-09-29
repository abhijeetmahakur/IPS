// Q40. Write a Java program to print:
// 1
// 01
// 101
// 0101
// 10101
// 010101

class Q40 {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
}
