package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // testcase 도 long 으로 받아야 되는거를 몇날몇일 동안
        // 뭐가 문제인지 모르고 계속 풀고앉아있었다
        long testCase = Integer.parseInt(br.readLine());
        long sequence = (testCase - 1) * (testCase) / 2; // 주어지는 수의 등차수열합
        long sum = 0; // testCase 만큼 주어지는 수들의 중복된숫자가 포함된 수열의 합을 누적합
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testCase; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write(Long.toString(sum - sequence));
        bw.flush();
        bw.close();
        br.close();
    }
}