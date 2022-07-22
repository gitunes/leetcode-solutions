class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode h1 = dummy1;
        ListNode h2 = dummy2;
        while(curr!=null){
            if(curr.val<x){
                dummy1.next= curr;
                dummy1 = dummy1.next;
                
            }
            else{
                dummy2.next=curr;
                dummy2= dummy2.next;
            }
            curr= curr.next;
        }
        
        dummy1.next= h2.next;
        dummy2.next=null;
        return h1.next;
        
    }
}