/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode p = list1;
        ListNode q = list2;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(p!=null && q!=null)
        {
            if(p.val<=q.val)
            {
                head.next = new ListNode(p.val);
                p=p.next;
            }
            else
            {
                head.next = new ListNode(q.val);
                q=q.next;
            }
            head = head.next;
        }

        while(p!=null)
        {
            head.next = new ListNode(p.val);
            p=p.next;
            head=head.next;
        }

        while(q!=null)
        {
            head.next = new ListNode(q.val);
            q=q.next;
            head=head.next;
        }

        return temp.next;
    }
}