package baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최대힙으로 하려면 Comparator.reverseOrder() 로 우선순위를 역전 해줘야함 !
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0){
                if (maxHeap.isEmpty()) bw.write("0\n");
                else bw.write(maxHeap.poll() + "\n");
            } else {
                maxHeap.offer(x);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
