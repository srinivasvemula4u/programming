/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
*/

public class ReverseLinkedListII {

    /**
     * @param args the command line arguments
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode current = head, prev = null;
        if (m > n) {
            return null;
        }
        int c1 = 0;
        while ((c1 < m - 1) && (current != null)) {
            prev = current;
            current = current.next;
            c1++;
        }
        if (prev == null) {
            head = reverseLinkedList(current, n - m + 1);
        } else {
            prev.next = reverseLinkedList(current, n - m + 1);
        }
        return head;
    }

    public ListNode reverseLinkedList(ListNode root, int count) {
        ListNode current = root, previous = null, startNode = root;
        while (root != null && count > 0) {
            current = root.next;
            root.next = previous;
            previous = root;
            root = current;
            count--;
        }
        if (root != null) {
            startNode.next = root;
        }
        return previous;
    }

    public static void main(String[] args) {
        // TODO code application logic here

    }

}
