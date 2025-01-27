/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
        ListNode b = hB;
        ListNode a = hA;
        while(a != b ){
            a = (a == null) ? hB : a.next;
            b = (b == null) ? hA : b.next; 
        }
        return a;
    }

    // 0(m * n)
    // public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
    //     ListNode b = hB;
    //     ListNode a = hA;
    //     while(a != null && b != null){
    //         if(a == b) return a;
    //         while(b != null){
    //             b = b.next;
    //              if(a == b) return a;
    //         }
    //         a = a.next;
    //         b = hB;
           
    //     }
    //     return null;
    // }
}