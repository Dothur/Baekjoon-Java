package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Q15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder 사용하기
        int testNum = Integer.parseInt(br.readLine());
        int[] arr = new int[testNum];
        for (int i = 0; i < testNum; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}
