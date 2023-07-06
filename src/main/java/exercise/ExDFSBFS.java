package exercise;

import java.util.*;

public class ExDFSBFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());   // [[],[],[],[],[]]  정점 +1 개의 빈 리스트 생성
        }

        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);          // 정점이 곧 인덱스 = graph 인덱스 v1 (정점) 리스트에  v2 (정점) 넣음
            graph.get(v2).add(v1);          //양바향인지 단방향인지에 따라 다름 문제 잘 읽어야함
            //graph 만드는 과정 끝
        }

        boolean[] visited = new boolean[n + 1];             //방문을 체크할 일차원 배열을 만듦 노드가 1 부터
        boolean[] visited1 = new boolean[n + 1];            //시작이니깐 하나 크게 함
        //visited 배열 만드는 과정

        dfs(s, graph, visited); //dfs 실행
        System.out.println();    //출력양식 맞춤용
        bfs(s, graph, visited1); // bfs 실행

        scanner.close();
    }

    //DFS 준비물은 재귀함수랑 방문 배열임을 외워야함
    public static void dfs(int num, List<List<Integer>> graph, boolean[] visited) {
        visited[num] = true; //s 방문 ex)1         시작점 방문
        System.out.print(num + " ");                //방문한 노드 출력
        Collections.sort(graph.get(num));            //문제가 원해서 한 정렬
        for (int nextNode : graph.get(num)) { //next 노드를 구하길 원함
            if (!visited[nextNode]) {        //next 노드 방문 안했으면 끝까지 깊이 탐색하기위해 재귀함수 사용
                dfs(nextNode, graph, visited);  //노드 끝까지 방문 했으면 방문 안했던 지점 찾아서 다시 방문시작
                //도달 가능한 모든 노드 탐색 후 종료됌 (실제로 visitied 배열에 false 있어도 상관 없음)
                // 궁금하면 본인이 어떤 경우일지 생각해보길 바람
            }
        }
    }

    // BFS 준비물은 큐랑 방문 배열임을 외워야함
    public static void bfs(int s, List<List<Integer>> graph, boolean[] visited1) {
        Queue<Integer> queue = new LinkedList<>();        // 큐 만들고 시작점 주어지면 걍 넣어야함 큐에 원소 있어야 While문 돌어감
        queue.add(s);                                     //방문배열 시작점 True
        visited1[s] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll(); //큐에 원소 없을때까지 들어온 순서 지켜서 나감
            System.out.print(x + " "); //노드 출력
            Collections.sort(graph.get(x));// 문제 특성상 정렬함
            for (int nextNode : graph.get(x)) { //인접 리스트에서 같은 노드들 순차적으로 반환(너비탐색)
                if (!visited1[nextNode]) {      // 방문 안했으면  그 노드 큐에 추가하고 방문체크함
                    queue.add(nextNode);        // 큐에 원소 없으면 탐색 끝
                    visited1[nextNode] = true;
                }
            }
        }
    }
}
