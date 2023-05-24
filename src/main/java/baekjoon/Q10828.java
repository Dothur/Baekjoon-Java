package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {
    private int[] arr = new int[10001];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(pointer);
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public void pop() {
        if (isEmpty()) System.out.println(-1);
        else {
            System.out.println(arr[--pointer]);
        }
    }

    public int size() {
        return this.pointer;
    }

    public void top() {
        if (isEmpty()) System.out.println(-1);
        else System.out.println(arr[this.pointer - 1]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandNum = Integer.parseInt(br.readLine());

        Q10828 st1 = new Q10828();

        for (int i = 0; i < commandNum; i++) {
            String cmd = br.readLine();
            if (cmd.contains(" ")) {
                StringTokenizer st = new StringTokenizer(cmd);
                if (st.nextToken().equals("push")) {
                    int pushNum = Integer.parseInt(st.nextToken());
                    st1.push(pushNum);
                }
            } else if (cmd.equals("pop")) {
                st1.pop();
            } else if (cmd.equals("size")) {
                System.out.println(st1.size());
            } else if (cmd.equals("empty")) {
                System.out.println((st1.isEmpty()) ? 1 : 0);
            } else if (cmd.equals("top")) {
                st1.top();
            }
        }
    }
}
