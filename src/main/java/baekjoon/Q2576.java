package baekjoon;

import java.io.*;

public class Q2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0) {
                sum += num;
                if (min > num) min = num;
            }
        }
        if (sum == 0) bw.write("-1");
        else bw.write(sum + "\n" + min);
        bw.flush();
        bw.close();
    }
}
