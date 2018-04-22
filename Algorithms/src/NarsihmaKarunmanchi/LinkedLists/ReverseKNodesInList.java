/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author sv186040
 */
public class ReverseKNodesInList {

    public static LinkedListNode reverseKNodesInList(LinkedListNode head, int k) {
        if(head == null)
            return null;
        LinkedListNode current = head, prev = null, next = null;
        int count = k;
        while (current != null && count > 0) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            count--;
        }
        if (next != null) {
            head.setNext(reverseKNodesInList(next, k));
        }
        return prev;
    }

    public static LinkedListNode reverseKNodesInListIterative(LinkedListNode head, int k) {
        LinkedListNode current = head;
        LinkedListNode prevTail = null, prevCurrent = head;
        while (current != null) {
            int count = k;
            LinkedListNode tail = null, next = null;
            while (current != null && count > 0) {
                next = current.getNext();
                current.setNext(tail);
                tail = current;
                current = next;
                count--;
            }
            //Reversed K nodes
            if(prevTail != null) {
                prevTail.setNext(tail);     
            } else {
                head = tail;
            }
            prevTail = prevCurrent;
            prevCurrent = current;
        }
        return head;
    }
    public static void main(String[] args) {
         LinkedList list = new LinkedList();
        //list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        list.insert(16,6);
        LinkedListNode head = reverseKNodesInList(list.getHead(), 4);
        //LinkedListNode head = reverseKNodesInListIterative(list.getHead(), 3);
         while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}
