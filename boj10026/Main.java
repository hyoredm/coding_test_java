package boj10026;

import java.util.*;
public class Main {

    static int n;
    static char[][]graph;
    static boolean[][]visit;

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};
    static char color;

    static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        scan.nextLine();

        graph = new char[n+1][n+1];
        visit = new boolean[n+1][n+1];

        color = graph[1][1];

        int n_cnt = 0;
        int abn_cnt = 0;


        for(int i = 1; i <= n; i++) {
            String c = scan.nextLine();
            for(int j = 1; j <= n; j++) {
                graph[i][j] = c.charAt(j-1);
            }
        }


        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(!visit[i][j]) {
                    color = graph[i][j];
                    bfs(i, j);
                    n_cnt++;
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(graph[i][j] == 'G') {
                    graph[i][j] = 'R';
                }
            }
        }

        visit = new boolean[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(!visit[i][j]) {
                    color = graph[i][j];
                    bfs(i, j);
                    abn_cnt++;
                }
            }
        }

        System.out.println(n_cnt + " " + abn_cnt);

    }

    public static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        visit[x][y] = true;

        while(!q.isEmpty()) {
            for(int i = 0; i < q.size(); i++) {
                Pair num = q.poll();

                for(int j = 0; j < 4; j++) {
                    int nx = num.x + dx[j];
                    int ny = num.y + dy[j];

                    if(nx > 0 && nx <= n && ny > 0 && ny <= n) {
                        if(!visit[nx][ny] && graph[nx][ny] == color) {
                            visit[nx][ny] = true;
                            q.offer(new Pair(nx, ny));
                        }
                    }
                }
            }
        }
    }
}
