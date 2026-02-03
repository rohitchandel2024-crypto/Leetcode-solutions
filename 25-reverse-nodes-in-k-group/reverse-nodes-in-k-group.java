class Solution {

    ListNode reverse(ListNode head,int size){
        ListNode curr=head;
        ListNode prev=null;
        while(size-- >0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode left=head;
        ListNode res=null;
        ListNode prevLeft=null;
       
        int size=k;
     while(true){
         ListNode right=left;
        for(int i=0;i<k;i++){
            if(right==null){
                return res!=null ? res: head;
            }
            right=right.next;
        }

        ListNode nextLeft=right;
        ListNode newHead= reverse(left,size);
        if(prevLeft!=null){
            prevLeft.next=newHead;
        }
        prevLeft=left;
        if(res==null){
            res=newHead;
        }
        left.next=nextLeft;
        left=nextLeft;
        
    }
    }
      
}
