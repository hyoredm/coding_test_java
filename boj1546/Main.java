package boj1546;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        scan.nextLine();

        String score = scan.nextLine();

        String[] scores = score.split(" ");

        int M = 0;
        double sum = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(M < Integer.parseInt(scores[j])) {
                    M = Integer.parseInt(scores[j]);
                }
            }
            sum += ((double)Integer.parseInt(scores[i])/M)*100;
        }

        System.out.printf("%.6f", sum/size);
    }
}
