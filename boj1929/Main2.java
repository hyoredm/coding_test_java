package boj1929;

import java.util.*;

public class Main2 { // 시간 초과
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int[] nums = new int[N+1];

        for(int i = 0; i <= N; i++) {
            nums[i] = i;
        }

        nums[2] = 0;

        for(int i = 2; i <= N; i++) {
            for(int j = M; j <= N; j++) {
                if(nums[j] == i) {
                    continue;
                }

                if(nums[j] != 0) {
                    if(nums[j] % i == 0) {
                        nums[j] = 0;
                    }
                }
            }
        }

        for(int i = M; i <= N; i++) {
            if(nums[i] != 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
