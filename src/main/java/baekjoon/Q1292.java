package baekjoon;

import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt(), endNum = sc.nextInt();
        int[] arr = new int[1001];
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (cnt == 1001) break;
                arr[cnt] = i;
                cnt++;
            }
        }
        for (int i = startNum - 1; i < endNum; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
