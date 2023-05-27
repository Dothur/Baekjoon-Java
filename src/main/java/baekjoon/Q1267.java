package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int callNum = Integer.parseInt(br.readLine());
        int youngSik = 0;
        int minSik = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < callNum; i++) {
            int callTime = Integer.parseInt(st.nextToken());
            youngSik += (callTime / 30 + 1) * 10;
            minSik += (callTime / 60 + 1) * 15;
        }
        if (youngSik == minSik) bw.write("Y M " + youngSik);
        else if (youngSik > minSik) bw.write("M " + minSik);
        else if (youngSik < minSik) bw.write("Y " + youngSik);
        bw.flush();
        bw.close();
        br.close();
    }
}
