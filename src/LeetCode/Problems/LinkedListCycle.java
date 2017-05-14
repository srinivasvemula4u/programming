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
public class LinkedListCycle {

    /**
     * @param args the command line arguments
     */
    /*
    Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

}
