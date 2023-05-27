package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[20];
        int num = 1;

        for (int i = 0; i < 20; i++) {
            arr[i] = num;
            num++;
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int front = Integer.parseInt(st.nextToken()) - 1;
            int rear = Integer.parseInt(st.nextToken()) - 1;

            int n = (rear - front + 1) / 2;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int temp = arr[front + cnt];
                arr[front + cnt] = arr[rear - cnt];
                arr[rear - cnt] = temp;
                cnt++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
