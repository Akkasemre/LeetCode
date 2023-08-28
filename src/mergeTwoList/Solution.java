package mergeTwoList;

public class Solution {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {

        ListNode result =  new ListNode(0);
        ListNode curr = result;

        while (l1 != null && l2 !=null){

            if(l1.val <= l2.val){
                curr = l1;
                l1 = l1.next;
            } else {
                curr = l2;
                l2 = l2.next;
            }
            curr = curr.next;

        }
        curr.next = l1 !=null ? l1 : l2;
        return result.next;
    }
}