package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Q1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 우선순위 큐 최소 힙 ( 우선순위 큐 클래스는 기본적으로 최소힙 )
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                // 비어있으면 0
                if (minHeap.isEmpty()) bw.write("0\n");
                // 우선순위가 가장 높은 요소를 큐에서 제거하며 출력하기 poll
                else bw.write(minHeap.poll() + "\n");
            }
            // 0 이 아니면 요소 추가 하기 offer
            else minHeap.offer(x);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
