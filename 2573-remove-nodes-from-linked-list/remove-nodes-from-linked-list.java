class Solution {
    public ListNode removeNodes(ListNode head) {
       head= reverse(head);

        int maxSofar=Integer.MIN_VALUE;
        ListNode curr = head;
        ListNode prev=null;

        while(curr!=null){
            if(curr.val>=maxSofar){
                maxSofar=curr.val;
                prev=curr;
            }
            else{
                prev.next=curr.next;
            }
            curr=curr.next;
        }
        return reverse(head);
   
    }

    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next =head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}