package boj2589;

import java.util.*;
public class Main2 {

    static int row;
    static int col;

    static char[][] graph;
    static boolean[][] visit;

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};


    public static class Pair {
        int x;
        int y;

        int cnt;

        public Pair(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
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
                if(graph[i][j] == 'L') {

                    int temp = bfs(i, j);
                    result = Math.max(result, temp);
                }
            }
        }
        System.out.println(result);
    }
    public static int bfs(int x, int y){
        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y, 0));
        visit[x][y] = true;

        while(!q.isEmpty()) {
            for(int i = 0; i < q.size(); i++) {
                Pair nums = q.poll();

                for(int j = 0; j < 4; j++) {
                    int nx = nums.x + dx[j];
                    int ny = nums.y + dy[j];

                    if(nx > 0 && ny > 0 && nx <= row && ny <= col) {
                        if(!visit[nx][ny] && graph[nx][ny] == 'L') {
                            visit[nx][ny] = true;
                            q.offer(new Pair(nx, ny, nums.cnt+1));
                            max = Math.max(max, nums.cnt+1);
                        }
                    }
                }
            }
        }
        visit = new boolean[row+1][col+1];
        return max;
    }
}
