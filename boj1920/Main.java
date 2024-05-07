package boj1920;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] nArr = new int[N];

        for(int i = 0; i < N; i++){
            nArr[i] = scan.nextInt();
        }

        Arrays.sort(nArr);

        int M = scan.nextInt();
        int[] mArr = new int[M];


        int m;
        int result = 0;

        for(int i = 0; i < M; i++) {
            int start = 0;
            int end = nArr.length - 1;
            result = 0;
            mArr[i] = scan.nextInt();
//            System.out.println(mArr[i]);
            while(start <= end) {
                m = (start + end) / 2;
                if(mArr[i] < nArr[m]) {
                    end = m - 1;
                } else if(mArr[i] > nArr[m]) {
                    start = m + 1;
                } else {
                    result = 1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
