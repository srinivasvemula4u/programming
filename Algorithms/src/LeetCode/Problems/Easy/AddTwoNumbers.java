/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

/**
 *
 * @author srivemul
 */
/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    /*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 *  }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }

    public ListNode addTwoNumbersMethod2(ListNode l1, ListNode l2) {
        ListNode root = null, current = null;
        int rem = 0;
        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;
            int res = (val1 + val2 + rem) % 10;
            rem = (val1 + val2 + rem) / 10;
            if (root == null) {
                root = new ListNode(res);
                current = root;
            } else {
                ListNode temp = new ListNode(res);
                current.next = temp;
                current = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val1 = l1.val;
            int res = (val1 + rem) % 10;
            rem = (val1 + rem) / 10;
            ListNode temp = new ListNode(res);
            current.next = temp;
            current = temp;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val2 = l2.val;
            int res = (val2 + rem) % 10;
            rem = (val2 + rem) / 10;
            ListNode temp = new ListNode(res);
            current.next = temp;
            current = temp;
            l2 = l2.next;
        }
        if (l1 != null) {
            if (rem != 0) {
                ListNode temp = new ListNode(rem + l1.val);
                current.next = temp;
                current = temp;
                l1 = l1.next;
            }
            current.next = l1;
        } else if (l2 != null) {
            if (rem != 0) {
                ListNode temp = new ListNode(rem + l2.val);
                current.next = temp;
                current = temp;
                l2 = l2.next;
            }
            current.next = l2;
        } else if (l1 == null && l2 == null) {
            if (rem != 0) {
                current.next = new ListNode(rem);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
