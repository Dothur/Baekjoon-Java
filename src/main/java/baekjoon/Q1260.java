package baekjoon;

import java.io.*;
import java.util.*;

public class Q1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int nodes = Integer.parseInt(st1.nextToken());
        int edges = Integer.parseInt(st1.nextToken());
        int startNode = Integer.parseInt(st1.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            adjList.add(new ArrayList<>());  // [[], [], [], [], []] 정점 + 1개의 빈 리스트 생성해주기
        }
//        adjList.get(1).add(10);
//        System.out.println(adjList);
        for (int i = 0; i < edges; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st2.nextToken());
            int v2 = Integer.parseInt(st2.nextToken());

            adjList.get(v1).add(v2); // 양방향 단방향에 따라 다름 지금은 양방향이라 v1 v2 를 반대로도 추가해줌
            adjList.get(v2).add(v1); // 정점이 곧 인덱스
        }

        boolean[] visitedDFS = new boolean[nodes + 1]; // 노드가 1부터 시작이므로 +1 해주기
        boolean[] visitedBFS = new boolean[nodes + 1];

        dfs(startNode, adjList, visitedDFS);
        System.out.println();
        bfs(startNode, adjList, visitedBFS);

//        System.out.println(adjList);

        br.close();
    }

    // DFS : 재귀함수랑 방문 배열 !
    public static void dfs(int num, List<List<Integer>> adjList, boolean[] visitedDFS) {
        visitedDFS[num] = true;  // 처음엔 시작점 방문기록 남겨줌 / 그후엔 재귀함수를 타고 해당 nextNode 기록남김
        System.out.print(num + " ");  // 방문기록 남겼으면 출력 먼저해줌
        Collections.sort(adjList.get(num));  // 정점 번호가 작은 것을 먼저 방문 : sort
        for (int nextNode : adjList.get(num)){ // ex) [2,3,4] 의 2 ~ 4 까지 돌면서
                                                // [2,3,4] 는 1 이라는 정점이랑 연결된 정점 리스트라 생각하기
            if (!visitedDFS[nextNode]){        // if 문에서 조건이 맞으면 재귀돌림
                dfs(nextNode, adjList, visitedDFS); // 재귀
            }
        }
    }

    // BFS : 큐, 방문 배열 !
    public static void bfs(int num, List<List<Integer>> adjList, boolean[] visitedBFS) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        visitedBFS[num] = true;

        while (!queue.isEmpty()) {
            int val = queue.poll(); // 큐 맨앞 삭제하고 값 val 에 넣기
            System.out.print(val + " ");
            Collections.sort(adjList.get(val));
            for (int nextNode : adjList.get(val)){
                if (!visitedBFS[nextNode]){
                    queue.add(nextNode);
                    visitedBFS[nextNode] = true;
                }
            }
        }
    }
}

