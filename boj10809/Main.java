package boj10809;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String S = scan.nextLine();


        List<String> strList = new ArrayList<>();

        for(int j = 0; j < S.length(); j++) {
            strList.add(S.substring(j, j + 1));
        }

        for(int i = 0; i < 26; i++) {

            char alpabat = (char)('a' + i);
            String alpabat2 = String.valueOf(alpabat);

            if(strList.contains(alpabat2)) {
                for(int k = 0; k < strList.size(); k++) {
                if(strList.get(k).equals(alpabat2)) {
                    System.out.print(k + " ");
                    break;
                    }
                }
            } else {
                System.out.print("-1 ");
            }
        }

    }
}
