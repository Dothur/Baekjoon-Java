package baekjoon;

import java.util.Scanner;

public class Q2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int jNum = sc.nextInt();
        // 입력받은 정수 크기의 배열 입력받기
        int[][] arr = new int[iNum][jNum];
        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j < jNum; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 배열에서 구간 케이스 k 개 구하기 , 합을 구할 부분의 개수 k
        int sumK = sc.nextInt();
        for (int i = 0; i < sumK; i++) {
            int iVal = sc.nextInt();
            int jVal = sc.nextInt();
            int xVal = sc.nextInt();
            int yVal = sc.nextInt();
            int sum = 0;
            for (int j = iVal - 1; j < xVal; j++) {
                for (int k = jVal - 1; k < yVal; k++) {
                    sum += arr[j][k];
                }
            }
            System.out.println(sum);
        }
    }
}
