package baekjoon;

import java.io.*;
import java.util.Stack;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) stack.push(num);
            else stack.pop();
        }
        int sum = 0;
        while (stack.size() != 0){
            sum += stack.peek();
            stack.pop();
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
