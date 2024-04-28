package boj11720;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자의 갯수를 입력해주세요");

        int size = scan.nextInt();
        scan.nextLine();

        System.out.println("숫자를 입력해주세요");

        String num = scan.nextLine();

        char[] arr = new char[size];

        int sum = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = num.charAt(i);
            sum += num.charAt(i) - '0';
        }

//        for(int i = 0; i < size; i++) {
//            sum += num.charAt(i) - '0';
//        }

        System.out.println(sum);

        scan.close();

    }
}
