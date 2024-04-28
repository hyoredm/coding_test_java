//package boj11660;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        int N = scan.nextInt();
//        scan.nextLine();
//
//        int M = scan.nextInt();
//        scan.nextLine();
//
//        int[][] num = new int[N][N];
//        int sum = 0;
//
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < N; j++) {
//                sum += scan.nextInt();
//                num[i][j] = sum;
//            }
//        }
//
//        for(int i = 0; i < M; M++) {
//            int x1 = scan.nextInt();
//            int y1 = scan.nextInt();
//            int x2 = scan.nextInt();
//            int y2 = scan.nextInt();
//
//
//            if(x1>=1 && y1>1) {
//                System.out.println(num[x2 - 1][y2 - 1] - num[x1 - 1][y1 - 2]);
//            } else if(y1==1 && x1>1) {
//                System.out.println(num[x2 - 1][y2 - 1] - num[x1 - 2][N-1]);
//            } else if(x1==1 && y1==1) {
//                System.out.println(num[x2 - 1][y2 - 1]);
//            }
//        }
//
//    }
//}
