package boj2018;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sub = 0;
        int T = 1;
        int result = 1;

        for(int i = 1; i < num; i++) {
            sub += i;
            if (sub >= num) {
                break;
            }
            if(((num-sub) % (T+1)) == 0) {
                result += 1;
                System.out.println(sub);
            }
            T += 1;
        }
        System.out.println(result);
    }
}
