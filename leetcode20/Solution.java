package leetcode20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        boolean result = false;

        for(int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i+1);
            if (temp.equals("(") || temp.equals("[") || temp.equals("{")) stack.push(temp);

            if(!stack.isEmpty()) {
                if (temp.equals(")")) {
                    if ("(".equals(stack.peek())) {
                        stack.pop();
                    }
                    else {
                        return result;
                    }
                } else if (temp.equals("]")) {
                    if ("[".equals(stack.peek())) {
                        stack.pop();
                    }
                    else {
                        return result;
                    }
                } else if (temp.equals("}")) {
                    if ("{".equals(stack.peek())) {
                        stack.pop();
                    }
                    else {
                        return result;
                    }
                }
            }
            else {
                return result;
            }
        }

        if(stack.isEmpty()) result = true;

        return result;
    }
}
