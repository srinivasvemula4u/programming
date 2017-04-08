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
public class ReverseLinkedList {

    /**
     * @param args the command line arguments
     */
    /*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while(head != null) {
            current = head.next;
            head.next = previous;
            previous = head;
            head = current;
        }
        return previous;
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
