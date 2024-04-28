package boj12891;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int p = scan.nextInt();

        scan.nextLine();

        String[]arr = new String[s];

        int start = 0;
//        int end = start + p;

        for(int i = 0; i < s; i++) {
            arr[i] = scan.nextLine();
        }

        int a = scan.nextInt();
        int c = scan.nextInt();
        int g = scan.nextInt();
        int t = scan.nextInt();

        int aNum = 0;
        int cNum = 0;
        int gNum = 0;
        int tNum = 0;

        int result = 0;

        while(start <= (s-p)) {
            for(int i = start; i < (start+p); i++) {
                if(arr[i].equals("A")) {
                    aNum++;
                } else if (arr[i].equals("C")) {
                    cNum++;
                } else if (arr[i].equals("G")) {
                    gNum++;
                } else if (arr[i].equals("T")) {
                    tNum++;
                }
            }
            if((aNum >= a) && (cNum >= c) && (gNum >= g) && (tNum >= t)) {
                System.out.println("A : " + aNum + "C : " + cNum + "G : " + gNum + "T : " + tNum);
                result++;
            }
            aNum = 0;
            cNum = 0;
            gNum = 0;
            tNum = 0;

            start++;
        }
        scan.close();
        System.out.println(result);
    }
}
