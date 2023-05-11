package baekjoon;

import java.io.*;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // BufferedReader 로 라인 단위로 읽어 들임
        // 그래서 공백을 기준으로 분리하기 위해 StringTokenizer 로 br.readLine() 문자열을 공백 기준으로 나눔
        StringTokenizer st = new StringTokenizer(br.readLine());
        int unHeard = Integer.parseInt(st.nextToken()); // 듣도 못한놈
        int didntSee = Integer.parseInt(st.nextToken()); // 보도 못한놈

        // HashSet 으로 듣도 못한놈을 입력받기
        // HashSet 집합 자료형 // * 중요특징 :중복허용 x, 순서가 뒤죽박죽
        // HashSet 으로 교집합을 찾기 위함 A.retainAll(B);
        HashSet<String> unHeardSet = new HashSet<>();
        for (int i = 0; i < unHeard; i++) {
            unHeardSet.add(br.readLine());
        }
        HashSet<String> didntSeeSet = new HashSet<>();
        for (int i = 0; i < didntSee; i++) {
            didntSeeSet.add(br.readLine());
        }
        // HashSet 끼리의 교집합 찾기
        unHeardSet.retainAll(didntSeeSet);

        // 문제 출력 조건때문에 정렬을 하기위해 ArrayList 로 만듦
        ArrayList<String> resArr = new ArrayList<>(unHeardSet);
        // naturalOrder() : 오름차순 정렬
        resArr.sort(Comparator.naturalOrder());

        // 중복된 듣도보도못한놈이 몇명인지 출력
        bw.write(resArr.size() + "\n");

        for (int i = 0; i < resArr.size(); i++) {
            bw.write(resArr.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

