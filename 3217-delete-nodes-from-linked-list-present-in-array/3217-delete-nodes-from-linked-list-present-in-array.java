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
    public ListNode modifiedList(int[] nums, ListNode head) {
         Set<Integer> setz = new HashSet<>();
        for(int num : nums){
            setz.add(num);
        }
        ListNode curr = head;
        ListNode prev = head;
        while(curr!=null){
            ListNode next = curr.next;
            if(setz.contains(curr.val)){
                if(curr==head){
                    head=next;
                }
                prev.next = next;
            }else{
                prev = curr;
            }
            curr = next;
        }
        return head;
    }
}