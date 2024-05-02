package boj2750;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[]input = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = scan.nextInt();
        }

        Arrays.sort(input);

        for(int i : input) System.out.println(i);
    }
}
