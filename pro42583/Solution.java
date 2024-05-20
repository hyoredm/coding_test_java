package pro42583;

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> passed = new LinkedList<>();
        Queue<Integer> passing = new LinkedList<>();
        Queue<Integer> waiting = new LinkedList<>();

        for(int i = 0; i < truck_weights.length; i++) {
            waiting.add(truck_weights[i]);
        }

        answer++; // answer 1


        return answer;
    }
}