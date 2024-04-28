package boj1940;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] num = new int[N];
        int start = 0;
        int end = N-1;
        int sum = 0;
        int result = 0;

        for(int i = 0; i < N; i++) {
            num[i] = scan.nextInt();
        }

        Arrays.sort(num);

        while(start < end) {
            sum = num[start] + num[end];

//            if(sum <= M) {
//                start++;
//            } else if(sum > M) {
//                end--;
//            }
//
//            if(sum == M) {
//                result++;
//            }

            if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            } else {
                result++;
                start++;
                end--;
            }
        }

            System.out.println(result);

        }
    }
