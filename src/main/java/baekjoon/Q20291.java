package baekjoon;

import java.io.*;
import java.util.*;

public class Q20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // HashMap 으로 ex) sbrus.txt 일때 .을 기준으로 키, 밸류로 받아보자

        Map<String, Integer> countMap = new HashMap<>();
        int fileNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < fileNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken(); // 앞 문자열 무시
            String str = st.nextToken();
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        List<String> list = new ArrayList<>(countMap.keySet());
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " " + countMap.get(list.get(i)) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
