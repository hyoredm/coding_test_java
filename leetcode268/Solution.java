package leetcode268;

import java.util.*;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        boolean flag = false;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                result = i;
                flag = true;
                break;
            }
        }
        if(!flag) result = nums.length;
        return result;
    }
}

