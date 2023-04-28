package baekjoon;

import java.util.Scanner;

public class Q2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // 윗 도형 * 이 맞닿는 곳까지
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = count; j > i * 2 - (count); j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 아랫 도형
        for (int i = 1; i < count; i++) {
            for (int j = i; j < count; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = count; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
