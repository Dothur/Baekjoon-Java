package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cardNum = Integer.parseInt(br.readLine());
        // 큐 사용해보기
        // offer() : 맨 뒤에 값 넣기
        // poll() : 앞의 수 삭제하기
        // LinkedList : 연결 리스트 / 데이터의 추가 삭제가 쉬움
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= cardNum; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
