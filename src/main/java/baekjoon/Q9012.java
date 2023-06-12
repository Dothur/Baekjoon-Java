package baekjoon;

import java.io.*;
import java.util.Stack;

public class Q9012 {
    public static boolean isValidPs(String input){
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            // 1. 여는 괄호를 만날때 push
            if (next == '('){
                charStack.push(next);
            }
            // 2. 닫는 괄호를 만날때
            else if (next == ')'){
                if (charStack.isEmpty()) return false;
                char top = charStack.pop();
                if (top != '(') return false;
            }
        }
        return charStack.isEmpty();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            if (isValidPs(input)) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
        bw.close();
    }
}
