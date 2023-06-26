package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int comNum = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= comNum; i++) { // ex) node 7 edge 6
            adjList.add(new ArrayList<>());  // [[빈칸], [], [], [], [], [], [], []]
        }
        for (int i = 0; i < edges; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }
//        System.out.println(adjList);

        boolean[] visitedDFS = new boolean[comNum + 1];

        dfs(1, adjList, visitedDFS);
        System.out.println(count);
    }
    public static int count = 0;
    public static void dfs(int num, List<List<Integer>> adjList, boolean[] visitedDFS){
        visitedDFS[num] = true;
        Collections.sort(adjList.get(num));
        for (int nextNode : adjList.get(num)){
            if (!visitedDFS[nextNode]){
                count += 1;
                dfs(nextNode, adjList, visitedDFS);
            }
        }
    }
}
