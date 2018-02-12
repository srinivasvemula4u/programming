/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

import java.util.Stack;

/**
 *
 * @author sv186040 Given a singly linked list L:l1->l2->l3....->ln-1->ln
 * reorder it to l1->ln->l2->ln-1... Divide the list into two parts using
 * fastptr and slowptr Reverse the second list using stack Traverse second list
 * node by node and insert at first list alternatively
 */
public class ReorderList {

    public static void reorderList(LinkedListNode head) {
        LinkedListNode fastPtr = head, slowPtr = head;
        while (fastPtr != null && fastPtr.getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
        }
        LinkedListNode head2 = slowPtr.getNext();
        Stack<LinkedListNode> stack = new Stack<>();
        while (head2 != null) {
            stack.push(head2);
            head2 = head2.getNext();
        }
        while (!stack.isEmpty()) {
            LinkedListNode temp = stack.pop();
            temp.setNext(head.getNext());
            head.setNext(temp);
            head = temp.getNext();
        }

    }
}
