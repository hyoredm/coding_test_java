package pro42586;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qs = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        int cnt = 0;

        for(int i = 0; i < progresses.length; i++) {
            q.offer(progresses[i]);
            qs.offer(speeds[i]);
        }
        int d = 0;
        while(!q.isEmpty()) {
            cnt = 0;
            for(int i = 0; i < progresses.length; i++) {
                // if(progresses[i] + speeds[i]*d >= 100) {
                if(!q.isEmpty() && q.peek() + qs.peek()*d >= 100) {
                    q.poll();
                    qs.poll();
                    cnt++;
                }
            }
            d++;
            if(cnt != 0) result.add(cnt);
        }

        answer = new int[result.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
