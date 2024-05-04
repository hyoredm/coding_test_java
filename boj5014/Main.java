package boj5014;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int s = scan.nextInt();
        int g = scan.nextInt();

        int u = scan.nextInt();
        int d = scan.nextInt();

        int answer = 0;

        while(s < g) {
            s += u;
            answer++;
        }

        while(s != g) {
            s -= d;
            answer++;
            if(s < g && d == 0) {
                System.out.println("use the stairs");
                return;
            }
        }
        System.out.println(answer);
    }
}
