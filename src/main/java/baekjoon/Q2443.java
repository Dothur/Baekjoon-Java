package baekjoon;

import java.util.Scanner;

public class Q2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = count; k > i * 2 - (count - 1); k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
