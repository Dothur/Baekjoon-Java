package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10093 {
    public static void printResult (long num1, long num2){
        System.out.println(num1 - num2 - 1);
        for (long i = num2 + 1; i < num1; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        if (num1 > num2) {
            printResult(num1, num2);
        } else if (num1 < num2) {
            printResult(num2, num1);
        } else {
            System.out.println("0");
        }
    }
}
