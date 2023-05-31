package baekjoon;

import java.io.*;
import java.util.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstN = Integer.parseInt(br.readLine());
        Map<Integer, Integer> countMap = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < firstN; i++) {
            int num = Integer.parseInt(st1.nextToken());
            // Map 에서 put(key, value) 로써 num 을 키로 받고 value 를 카운트함
            // getOrDefault(num, 0) 은 map 에서 num 에 해당하는 값을 조회하고, 만약 값이
            // 없으면 default 값으로 0 을 반환한다.
            // 맨뒤에 +1 은 num 을 키로 하는 값이 존재하다면 해당 값을 1 증가시킴 중복값을 카운트함
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int secondM = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] resultArr = new int[secondM];
        for (int i = 0; i < secondM; i++) {
            int num = Integer.parseInt(st2.nextToken());
            // countMap 을 가져와서 새로 받은 num 키값의 value 인 카운트를 가져와서 resultArr 배열에 담아준다
            // countMap 에서 num 에 해당하는 값이 없으면 default 로 0 을 담아준다
            resultArr[i] = countMap.getOrDefault(num, 0);
        }
        // 결과 출력
        for (int result : resultArr) {
            bw.write(result + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

