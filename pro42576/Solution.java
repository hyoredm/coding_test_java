package pro42576;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<Integer,String> map = new HashMap<>();

        for(int i = 0; i < participant.length; i++) {
            map.put(i+1, participant[i]);
        }

        for(int i = 0; i < completion.length; i++) {
            map.values().remove(completion[i]);
        }

        // for(int i = 0; i < participant.length; i++) {
        //     if(map.containsValue(participant[i])) {
        //         answer = participant[i];
        //         break;
        //     }
        // }

        for(Map.Entry<Integer, String> entrySet : map.entrySet()) {
            answer = entrySet.getValue();
        }




        return answer;
    }
}
