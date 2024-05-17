package pro12909;

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> str = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                str.push('(');
            } else if(s.charAt(i) == ')') {
                if(!str.isEmpty()) {
                    str.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }


        if(!str.isEmpty()) {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}