package boj2178;

import java.util.*;
public class Main {

    static int[][]graph;
    static boolean[][]visit;

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

        int N = scan.nextInt();
        int M = scan.nextInt();
        scan.nextLine();

        graph = new int[N+1][M+1];
        visit = new boolean[N+1][M+1];

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        for(int i = 1; i <= N; i++) {
            String input = scan.nextLine();
            for(int j = 1; j <= M; j++) {
                graph[i][j] = Character.getNumericValue(input.charAt(j-1));
            }
        }

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(1,1));
        visit[1][1] = true;
        Boolean flag = false;

        while(!q.isEmpty()) {
            for(int i = 0; i < q.size(); i++) {
                Pair num = q.poll();

                if(num.x == N && num.y == M) {
                    flag = true;
                    break;
                }

                for(int j = 0; j < 4; j++) {
                    int nx = num.x + dx[j];
                    int ny = num.y + dy[j];

                    if(nx > 0 && ny > 0 && nx <= N && ny <= M) {
                        if(!visit[nx][ny] && graph[nx][ny] == 1) {
                            visit[nx][ny] = true;
                            graph[nx][ny] = graph[num.x][num.y] + 1;
                            q.offer(new Pair(nx, ny));
                        }
                    }
                }
            }
            if(flag) break;
        }
        System.out.println(graph[N][M]);
    }
}
