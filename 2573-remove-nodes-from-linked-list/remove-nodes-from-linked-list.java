class Solution {
    public ListNode removeNodes(ListNode head) {
    Stack <ListNode> st = new Stack<>();
    while(head!=null){
    while(!st.isEmpty() && st.peek().val<head.val){
        st.pop();
    }
    st.push(head);
    head = head.next;
    }
    ListNode next = null;
    while(!st.isEmpty()){
        ListNode node = st.pop();
        node.next = next;
        next = node;

    }
    return next;
    }

  
}