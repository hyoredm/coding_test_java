package boj11724;

import java.util.*;
public class Main {

    static int[][] graph;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        graph = new int[N+1][N+1];
        visit = new boolean[N+1];
        int answer = 0;

        for(int i = 0; i < M; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for(int i = 1; i <= N; i++) {
            if(!visit[i]) {
                dfs(N, i);
                answer++;
            }
        }

        System.out.println(answer);


    }

    public static void dfs(int N, int start) {
        visit[start] = true;
        for(int i = 1; i <= N; i++) {
            if(!visit[i] && graph[start][i] == 1) {
                dfs(N, i);
            }
        }
    }
}
