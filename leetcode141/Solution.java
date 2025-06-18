package leetcode141;

public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null) {
            if(head.val > 100000) {
                return true;
            }
            else
            {
                head.val = 100001;
                head = head.next;
            }
        }
        return false;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
