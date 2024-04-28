package boj2164;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i < N+1; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            q.remove();
            int num = q.remove();
            q.add(num);
        }

        System.out.println(q.peek());
    }

}
