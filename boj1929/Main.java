package boj1929;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();


        for(int i = M; i <= N; i++) {
            boolean value = false;

            if(i == 1) {
                continue;
            } else if(i == 2) {
                System.out.println(i);
                continue;
            }

//            for(int j = 2; j < i; j++) { // 기존의 시간초과 나는 풀이
//
//                if((i % j) == 0)  // i 보다 작은 j들로 나머지 구하기
//                {
//                    value = true; // 나머지가 있으면 소수가 아님
//                    break;
//                }
//            }

            for(int j = 2; j <= Math.sqrt(i); j++) {
                if((i % j) == 0)  // i 보다 작은 j들로 나머지 구하기
                {
                    value = true; // 나머지가 있으면 소수가 아님
                    break;
                }
            }

            if(!value) System.out.println(i); // 소수만 출력

        }
    }
}
