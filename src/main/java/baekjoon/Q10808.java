package baekjoon;

import java.io.*;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            alphabet[c - 97]++;
        }
        for (int i : alphabet) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
