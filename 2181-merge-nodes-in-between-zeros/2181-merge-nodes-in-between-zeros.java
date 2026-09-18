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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode left=head;
        while(left!=null){
            ListNode right = left;
            int sum=0;
            while(right.val!=0){
                sum+=right.val;
                right=right.next;
            }
            left.val=sum;
            left.next= right.next;
            left=left.next;
        }
        return head;
    }
}