package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Q1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num == 6) {
                num = 9;
            }
            arr[num]++;
        }
//        System.out.println(arr[9]);
//        System.out.println(arr[6]);
        arr[9] = arr[9] / 2 + arr[9] % 2;
        Arrays.sort(arr);
        bw.write(Integer.toString(arr[9]));
        bw.flush();
        bw.close();
    }
}
