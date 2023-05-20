package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int realFactorNum = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < realFactorNum; i++) {
            int factor = Integer.parseInt(st.nextToken());
            if (max < factor) {
                max = factor;
            }
            if (min > factor) {
                min = factor;
            }
        }
        bw.write(Integer.toString(max * min));
        bw.flush();
        bw.close();
        br.close();
    }
}
