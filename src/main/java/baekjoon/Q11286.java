package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            return abs1 == abs2 ? Integer.compare(o1, o2) : Integer.compare(abs1, abs2);
        });

        // 큐 값 추가/제거
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0){
                if (absHeap.isEmpty()) bw.write("0\n");
                else bw.write(absHeap.poll() + "\n");
            } else {
                absHeap.offer(x);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
