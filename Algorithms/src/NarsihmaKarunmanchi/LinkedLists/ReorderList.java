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
        slowPtr.setNext(null);
        Stack<LinkedListNode> stack = new Stack<>();
        while (head2 != null) {
            stack.push(head2);
            head2 = head2.getNext();
        }
        LinkedListNode current = head;
        while (!stack.isEmpty()) {
            LinkedListNode temp = stack.pop();
            temp.setNext(current.getNext());
            current.setNext(temp);
            current = temp.getNext();
        }
        current.setNext(null);

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        list.insert(16, 6);
        list.insert(17, 7);
        reorderList(list.getHead());
        LinkedListNode head = list.getHead();
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
        //System.out.println(list.toString());

    }
}
