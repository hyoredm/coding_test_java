package boj11659;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] S = new int[N + 1];

        for(int i = 1; i < N+1; i++) {
            S[i] += S[i-1] + scan.nextInt(); // 수정 코드 1
        }

        for(int k = 0; k < M; k++) {

            int i = scan.nextInt();
            int j = scan.nextInt();

            System.out.println(S[j] - S[i - 1]); // 수정 코드 2

        }

        scan.close();
    }
}