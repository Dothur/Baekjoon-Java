package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];
        int sizeResult = 0;
        int paperCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < paperCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[j][k] == 0){
                        arr[j][k] = 1;
                        sizeResult++;
                    }
                }
            }
        }
        bw.write(Integer.toString(sizeResult));
        bw.flush();
        bw.close();
    }
}