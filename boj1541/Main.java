package boj1541;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String[] arr = str.split("-");

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] nums = arr[i].split("\\+");
            int temp = 0;

            for (String num : nums) {
                temp += Integer.parseInt(num);
            }

            if (i == 0) {
                result = temp;
            } else if (i > 0) {
                result -= temp;
            }

        }

        System.out.println(result);

    }
}
