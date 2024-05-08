package boj11047;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] coins = new int[N];

        int cnt = 0;

        for(int i = 0; i < N; i++) {
            coins[i] = scan.nextInt();
        }

        for(int i = N-1; i >= 0; i--) {
            if(coins[i] <= K) {
                cnt += K / coins[i];
//                K = K - (coins[i] * (K / coins[i]));
                K = K % coins[i];
                }
            }
        System.out.println(cnt);
    }
}
