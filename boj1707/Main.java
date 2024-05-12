package boj1707;

import java.util.*;
public class Main {

    static boolean[] visit;
    static int[][] graph;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();

        for(int i = 0; i < K; i++) {
            int V = scan.nextInt();
            int E = scan.nextInt();

            visit = new boolean[V+1];
            graph = new int[V+1][V+1];

            for(int j = 0; j < E; j++) {
                int u = scan.nextInt();
                int v = scan.nextInt();

                graph[u][v] = 1;
            }

            int cnt = 0;

            for(int j = 1; j <= E; j++) {
                if(!visit[j]) {
                    System.out.println("진입 : " + j);
                    dfs(V, j);
                    cnt++;
                }
            }


            if(cnt != 1) {
                System.out.println("YES");
            } else if(cnt == 1) {
                System.out.println("NO");
            }
        }

    }

    static void dfs(int V, int start) {
        visit[start] = true;
        for(int i = 1; i <= V; i++) {
            if(!visit[i] && graph[start][i] == 1) {
                dfs(V, i);
            }
        }
    }
}
