package pro42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            // if(scoville[i] < K)
            pq.add(scoville[i]);
        }

        int cnt = 0;

        while(pq.size() > 1) {
            int f1 = 0;
            int f2 = 0;
            int nf = 0;

            if(pq.peek() < K) {
                f1 = pq.poll();
                f2 = pq.poll();
                nf = f1 + (f2*2);
                pq.add(nf);
                cnt++;
                answer = cnt;
            } else if(pq.peek() >= K) {
                break;
            }
        }

        if(pq.peek() < K) {
            answer = -1;
        }


        return answer;
    }
}