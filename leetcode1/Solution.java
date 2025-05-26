package leetcode1;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result = new int[]{nums[i], nums[j]};
                }
            }
        }
        return result;
    }
}
