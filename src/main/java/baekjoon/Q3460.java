package baekjoon;

import java.util.Scanner;

public class Q3460 {
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int count = 0;
        String[] binaryString = new String[0];
        for (int i = 1; i <= testCase; i++) {
            int num = sc.nextInt();
            binaryString = toBinary(num).split("");

            for (int j = binaryString.length - 1; j >= 0; j--) {
                if (binaryString[j].equals("1")) {
                    System.out.printf("%d ", count++);
                } else {
                    count++;
                }
            }
            count = 0;
        }
    }
}
