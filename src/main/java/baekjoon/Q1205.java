package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ranking = Integer.parseInt(st.nextToken());
        int myScore = Integer.parseInt(st.nextToken());
        int maxRanking = Integer.parseInt(st.nextToken());
        int rank = 1;
        if (ranking == 0){
            System.out.println(1);
            return; // 1 을 출력하고 종료 시킴
        }
        List<Integer> list = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        // 입력받은 랭킹값 만큼의 랭킹 리스트를 받아오기
        for (int i = 0; i < ranking; i++) {
            list.add(Integer.parseInt(st1.nextToken()));
        }
        // 맥스랭킹까지 꽉 차있고, 내 점수가 랭킹 리스트의 제일 마지막 랭킹보다 같거나 작으면 -1 출력
        if (list.size() == maxRanking && myScore <= list.get(list.size() - 1)){
            System.out.println(-1);
            return; // 범위를 넘어서 -1 출력하고 종료
        }
        // list 를 돌면서 myScore 이 들어갈 랭킹을 찾기
        for (int i = 0; i < ranking; i++) {
            if (list.get(i) <= myScore){
                rank = i + 1; // if 10 10 10 이면 rank = 0 + 1 로 바로 rank 를 정하고 break
                break;
            } else { // 조건에 안맞으면 rank 를 계속 올림
                rank++;
            }
        }
        System.out.println(rank);
    }
}