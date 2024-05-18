package pro42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();

        Queue<Integer> loc = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            q.add(priorities[i]);
        }

        for(int i = 0; i < priorities.length; i++) {
            if(i == location) {
                loc.add(1);
            } else {
                loc.add(0);
            }

        }

        Arrays.sort(priorities);

        int i = priorities.length-1;

        while(i >= 0) {
            if(!q.isEmpty() && !loc.isEmpty()) {
                if(q.peek() == priorities[i]) {
                    if(loc.peek() == 1) {
                        answer++;
                        break;
                    } else {
                        q.poll();
                        loc.poll();
                        answer++;
                        i--;
                    }
                } else {
                    int temp = q.poll();
                    q.add(temp);
                    int temp2 = loc.poll();
                    loc.add(temp2);
                }
            }
        }


        return answer;
    }
}
