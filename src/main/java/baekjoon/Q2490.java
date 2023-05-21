package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                result += Integer.parseInt(st.nextToken());
            }
            if (result == 0) System.out.println("D");
            else if (result == 1) System.out.println("C");
            else if (result == 2) System.out.println("B");
            else if (result == 3) System.out.println("A");
            else if (result == 4) System.out.println("E");
        }
    }
}
