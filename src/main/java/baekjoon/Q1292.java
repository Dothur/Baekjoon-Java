package baekjoon;

import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 구간의 시작, 끝을 나타내는 정수 입력받기
        int startNum = sc.nextInt(), endNum = sc.nextInt();
        // 정수 A, B 의 정해진 크기에 따라 배열 1001 크기로 선언
        int[] arr = new int[1001];
        // 누적합할 변수 선언
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                // cnt 를 증가시키다가 배열의 크기를 넘어가면 break;
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
