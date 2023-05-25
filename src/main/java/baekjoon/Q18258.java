package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q18258 {
    // queue : FIFO
    private int[] arr;
    private int front; // 큐의 첫번째 요소를 가리킴
    private int rear; // 큐의 마지막 요소를 가리킴

    public Q18258() {
        this.arr = new int[2000001];
        this.front = 0;
        this.rear = -1;
    }

    public void push(int value) {
        this.arr[++rear] = value;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void pop(BufferedWriter bw) throws IOException {
        if (isEmpty())
            bw.write("-1\n");
        else {
            bw.write(arr[front++] + "\n");
        }
    }

    public int size() {
        return rear - front + 1;
    }

    public void front(BufferedWriter bw) throws IOException {
        if (isEmpty())
            bw.write("-1\n");
        else
            bw.write(arr[front] + "\n");
    }

    public void back(BufferedWriter bw) throws IOException {
        if (isEmpty())
            bw.write("-1\n");
        else
            bw.write(arr[rear] + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int commandNum = Integer.parseInt(br.readLine());

        Q18258 queue = new Q18258();

        for (int i = 0; i < commandNum; i++) {
            String cmd = br.readLine();
            if (cmd.contains(" ")) {
                StringTokenizer st = new StringTokenizer(cmd);
                if (st.nextToken().equals("push")) {
                    int pushNum = Integer.parseInt(st.nextToken());
                    queue.push(pushNum);
                }
            } else if (cmd.equals("pop")) {
                queue.pop(bw);
            } else if (cmd.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd.equals("empty")) {
                bw.write((queue.isEmpty()) ? "1\n" : "0\n");
            } else if (cmd.equals("front")) {
                queue.front(bw);
            } else if (cmd.equals("back")) {
                queue.back(bw);
            }
        }

        bw.flush();
        bw.close();
    }
}
