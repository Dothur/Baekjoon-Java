package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heightArray = new int[9];
        int sum = 0;
        for (int i = 0; i < heightArray.length; i++) {
            heightArray[i] = sc.nextInt();
            sum += heightArray[i];
        }
        Arrays.sort(heightArray);
        // 브루트포스 알고리즘
        for (int i = 0; i < heightArray.length - 1; i++) { // 배열에서 마지막 값 한개 빼고
            for (int j = i + 1; j < heightArray.length; j++) { // 배열에서 첫번째 값 한개 빼고
                if (sum - heightArray[i] - heightArray[j] == 100) { // 배열에서 값 두개를 sum 에서 뺀 값이 100 이면
                    for (int k = 0; k < heightArray.length; k++) {
                        if (i == k || j == k) { // i 나 j 가 k 인덱스와 같다면
                            continue;           // k++ 으로 넘어가서 k 반복문의 다음반복을 이어서함
                        }
                        System.out.println(heightArray[k]);
                    }
                    return;
                }
            }
        }
    }
}
