package boj10809;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
//        int[] answer = new int[26];

//        int idx = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            boolean flag = false;
            for (int i = 0; i < input.length(); i++) {
                if (c == input.charAt(i)) {
                    System.out.print(i + " ");
//                    answer[idx] = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print("-1 ");
//                answer[idx] = -1;
            }
//            idx++;
        }

//        for (int i : answer) {
//            System.out.print(i + " ");
//        }
    }
}
