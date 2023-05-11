package baekjoon;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        int sum = 0;
        // 입력은 무조건 자연수
        int min = -1;
        for (int i = startNum; i <= endNum; i++) {
            // 먼저 true 값을 줌
            boolean isPrime = true;
            // i 가 1이면 continue
            if (i < 2) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                // 맨 처음값이 최소값
                if (min == -1) {
                    min = i;
                }
                // 누적합
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}

