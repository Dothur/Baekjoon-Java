package baekjoon;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < testCase; i++) {
            int num = sc.nextInt();
            int factors = 0;
            // num 이 1 일때는 건너뛰기
            if (num == 1) {
                continue;
            }
            // 소수인지 판별 factors 의 값이 증가되지않아야 소수이다.
            for (int j = 2; j < num; j++) {
                if (num % j == 0){
                    factors++;
                }
            }
            // 소수의 개수 누적
            if (factors == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
