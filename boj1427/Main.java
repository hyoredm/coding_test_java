package boj1427;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.nextLine();

        Character[]input = new Character[N.length()];

        for(int i = 0; i < N.length(); i++) {
            input[i] = N.charAt(i);
        }

        Arrays.sort(input, Collections.reverseOrder());

        for(int i : input) System.out.print(i - '0');
    }
}
