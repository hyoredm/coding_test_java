package boj5014;

import java.util.*;
public class Main {
    static int[]graph;
    static boolean[]visit;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int s = scan.nextInt();
        int g = scan.nextInt();

        int u = scan.nextInt();
        int d = scan.nextInt();

        graph = new int[f+1];
        visit = new boolean[f+1];

        int[]dy = {u, -d};

        Boolean flag = false;

        Queue<Integer> q = new LinkedList<>();

        q.offer(s);
        visit[s] = true;

        while(!q.isEmpty()) {
            for(int i = 0; i < q.size(); i++) {
                int num = q.poll();

                if(num == g) {
                    flag = true;
                    break;
                }

                for(int j = 0; j < 2; j++) {
                    int ny = num + dy[j];

                    if(ny > 0 && ny <= f) {
                        if(!visit[ny]) {
                            visit[ny] = true;
                            graph[ny] = graph[num] + 1;
                            q.offer(ny);
                        }
                    }
                }
            }
            if(flag) break;
        }
        if(!visit[g]) {
            System.out.println("use the stairs");
        } else System.out.println(graph[g]);
    }
}
