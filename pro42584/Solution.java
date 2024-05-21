package pro42584;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int cnt = 0;

        for(int i = 0; i < prices.length; i++) {
            cnt = 0;
            if(i == prices.length-1) {
                answer[i] = 0;
            } else {
                for(int j = i + 1; j < prices.length; j++) {
                    cnt++;
                    if(prices[i] > prices[j]) {
                        break;
                    }
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
}

