package boj1707;

import java.util.*;
public class Main2 {

    static List<Boolean> visit;

    //    static boolean[] visit;
//    static int[][] graph;

    static class Pair {
        int x = 0;
        int y = 0;
        int value = 0;

         Pair(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;

        }

        Pair(int x) {
             this.x = x;
        }
    }

    static List<Pair> graph;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();

        for(int i = 0; i < K; i++) {
            int V = scan.nextInt();
            int E = scan.nextInt();

//            visit = new boolean[V+1];
//            graph = new int[V+1][V+1];
            visit = new ArrayList<>();
            graph = new ArrayList<>();
            for(int j = 0; j <= V; j++) {
                visit.add(false);
                graph.add(new Pair(j));
            }

            for(int j = 0; j < E; j++) {
                int u = scan.nextInt();
                int v = scan.nextInt();

                graph.set(u, new Pair(u, v, 1));
                System.out.println(u + "의 value : " + graph.get(u).value);
            }

            int cnt = 0;

            for(int j = 1; j <= E; j++) {
                if(!visit.get(j)) {
//                    System.out.println("진입 : " + j);
                    dfs(V, j);
                    cnt++;
                    if(cnt > 1) {
                        break;
                    }
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
        visit.set(start, true);
        for(int i = 1; i <= V; i++) {
            if(!visit.get(i) && graph.get(i).value == 1) {
                dfs(V, i);
            }
        }
    }
}

