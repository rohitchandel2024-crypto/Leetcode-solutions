class Solution {
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr= head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr =next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
     if (head == null || head.next == null) return true;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      ListNode second=reverse(slow);
      ListNode copySecond=second;
      ListNode first=head;
      while(second!=null){
        if(first.val!=second.val){
            reverse(copySecond);
            return false;
        }
        first=first.next;
        second=second.next;
      }
      reverse(copySecond);
      return true;
    }
}