package pro12906;

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> result = new ArrayList<Integer>();


        int target = arr[0];
        result.add(target);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == target) {
                continue;
            } else {
                target = arr[i];
                result.add(target);
            }
        }

        answer = new int[result.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
