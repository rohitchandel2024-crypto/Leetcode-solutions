class Solution {

    ListNode reverse(ListNode head , int size){
        ListNode curr = head;
        ListNode prev = null;
        while(size-- > 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode swapPairs(ListNode head) {

        ListNode left = head;
        ListNode right;
        ListNode prevLeft = null;
        int size = 2;
        ListNode res = null;

        while(left!=null && left.next!=null){
            right =left;
            for(int i=0;i<(size-1);i++){
                if(right==null) break;
                right=right.next;
            }

            if(right!=null){
                ListNode nextLeft =right.next;
                ListNode newHead =reverse(left,size);
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
        return res!=null ? res : head;
    }
}
