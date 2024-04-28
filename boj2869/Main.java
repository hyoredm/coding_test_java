package boj2869;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int S = A - B;
        if(((V-B) % S) == 0) {
            System.out.println((V-B)/S);
        } else {
            System.out.println((V-B)/S + 1);
        }

    }
}
