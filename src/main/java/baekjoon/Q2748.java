package baekjoon;

import java.io.*;

public class Q2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long[] fibonacciArr = new long[(int) (num + 1)];

        fibonacciArr[0] = 0;
        if (num != 0) fibonacciArr[1] = 1;

        for (int i = 2; i < fibonacciArr.length; i++) {
            fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
        }
//        for (int i = 0; i < fibonacciArr.length; i++) {
//           bw.write(fibonacciArr[i] + " ");
//        }
        bw.write(Long.toString(fibonacciArr[(int) num]));
        bw.flush();
        bw.close();
    }
}
