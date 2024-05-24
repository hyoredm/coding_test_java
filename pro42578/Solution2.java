package pro42578;

import java.util.*;

class Solution2 {
    public int solution(String[][] clothes) {
        int answer = 1;
        int len = clothes.length;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            String kind = clothes[i][1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        for (int i : map.values()) {
            answer *= (i + 1); // 옷을 입고, 안 안입는 경우의 수 -> + 1
        }

        return answer - 1; // 아무것도 안입는 경우의수 - 1
    }
}
