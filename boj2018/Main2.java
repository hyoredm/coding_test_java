package boj2018;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int start = 1;
        int end = 1;
        int sum = 1;

        int result = 0;

        while(start <= end) {
            if(sum == num) {
                result++;
            }

            if(sum < num) {
                end++;
                sum += end;
            } else if(sum >= num) {
                sum -= start;
                start++;
            }
        }

        System.out.println(result);
    }
}
