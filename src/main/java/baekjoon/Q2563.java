package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // boolean 배열로 풀기 , [100][100] 으로 했을 때 런타임 에러
        boolean[][] arr = new boolean[101][101];
        int sizeResult = 0;
        int paperCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < paperCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]){
                        arr[j][k] = true;
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