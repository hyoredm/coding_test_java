package pro42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while(pq.size() > 1) {
            int f1 = 0;
            int f2 = 0;
            int nf = 0;
            int cnt = 0;

            if(pq.peek() < K) {
                f1 = pq.poll();
                f2 = pq.poll();
                nf = f1 + f2;
                pq.add(nf);
                cnt++;
                answer = cnt;
            } else if(pq.peek() > K) {
                break;
            }
        }


        return answer;
    }
}