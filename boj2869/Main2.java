package boj2869;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // 낮에 올라가는 거리
        int b = scan.nextInt(); // 밤에 떨어지는 거리
        int v = scan.nextInt(); // 총 가야되는 거리

        // 하루에 a - b 씩 올라갈수 있다.
        // v >= (a - b) * n + a

        v -= a; // 마지막에 올라가는 만큼 뺸 v == 도달 하루 전
        int answer = v % (a - b) == 0 ? v / (a - b) : v / (a - b) + 1;

//        if (v % (a - b) == 0) {
//            answer = v / (a - b);
//        } else {
//            answer = v / (a - b)+ 1;
//        }

        System.out.println(answer + 1);
    }
}
