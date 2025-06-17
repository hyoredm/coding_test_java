package leetcode125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        int end = s.length();

        for(int i = 0; i<end; i++) {
            if(s.charAt(i) != s.charAt(end-1-i)) return false;
        }

        return true;
    }
}
