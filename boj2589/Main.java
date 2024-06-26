package boj2589;

import java.util.*;
public class Main {

    static int row;
    static int col;

    static char[][] graph;
    static boolean[][] visit;

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};


    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        row = scan.nextInt();
        col = scan.nextInt();

        scan.nextLine();

        graph = new char[row + 1][col + 1];
        visit = new boolean[row + 1][col + 1];

        for(int i = 1; i <= row; i++) {
            String map = scan.nextLine();
            for(int j = 1; j <= col; j++) {
                graph[i][j] = map.charAt(j-1);
            }
        }

        int result = 0;

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                visit = new boolean[row+1][col+1];
                if(graph[i][j] == 'L') {
                    int temp = bfs(i, j);
                    result = Math.max(result, temp);
                }
            }
        }
        System.out.println(result - 1);
    }
    public static int bfs(int x, int y){
        int answer = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        visit[x][y] = true;

        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Pair nums = q.poll();

                for(int j = 0; j < 4; j++) {
                    int nx = nums.x + dx[j];
                    int ny = nums.y + dy[j];

                    if(nx > 0 && ny > 0 && nx <= row && ny <= col) {
                        if(!visit[nx][ny] && graph[nx][ny] == 'L') {
                            visit[nx][ny] = true;
                            q.offer(new Pair(nx, ny));
                        }
                    }
                }
            }
           answer++;
        }
        return answer;
    }
}
