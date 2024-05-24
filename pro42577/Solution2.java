package pro42577;

import java.util.*;

class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        int len = phone_book.length;
        for (int i = 1; i < len; i++) {
            if (phone_book[i].indexOf(phone_book[i - 1]) == 0) {
                answer = false;
                break;
            }
        }

        // for (int i = 0; i < len - 1; i++) {
        //     if (phone_book[i + 1].startsWith(phone_book[i])) {
        //         answer = false;
        //     }
        // }

        return answer;
    }
}
