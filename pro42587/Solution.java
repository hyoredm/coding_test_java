package pro42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            q.add(priorities[i]);
        }

        int target = priorities[location];

        Arrays.sort(priorities);

        for(int i = priorities.length-1; i <= 0; i--) {
            if(!q.isEmpty()) {
                if(q.peek() == priorities[i]) {
                    if(q.peek() == target) {
                        q.poll();
                        answer++;
                        break;
                    } else {
                        q.poll();
                        answer++;
                    }
                } else {
                    int tmp = q.poll();
                    q.add(tmp);
                }
            }
        }


        return answer;
    }
}
