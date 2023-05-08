package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            // 배열 내림차순 정렬하기
            Arrays.sort(arr, Collections.reverseOrder());
            // 배열에서 3번째로 큰수 출력
            System.out.println(arr[2]);
        }
    }
}
