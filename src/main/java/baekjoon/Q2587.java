package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Q2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }
        Arrays.sort(arr);
        bw.write(sum / arr.length + "\n" + arr[arr.length / 2]);
        bw.flush();
        bw.close();
    }
}
