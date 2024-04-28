package boj1874;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[]nums = new int[n];
        int idx = 0;
        int k = 0;
        List<String> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        while(idx < n) {

            if(stack.isEmpty()){
                k++;
                stack.push(k);
                result.add("+");
            }

            if((!stack.isEmpty()) && stack.peek() == nums[idx]) {
                stack.pop();
                result.add("-");
                idx++;
            } else if((!stack.isEmpty()) && stack.peek() < nums[idx]) {
                k++;
                stack.push(k);
                result.add("+");
            } else {
                System.out.println("No");
                break;
            }
        }

        if(idx == n) {
            for (String i : result) {
                System.out.println(i);
            }
        }
    }
}
