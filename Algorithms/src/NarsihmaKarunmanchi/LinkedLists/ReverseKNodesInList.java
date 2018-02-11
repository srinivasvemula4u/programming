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
            current.setNext(reverseKNodesInList(next, k));
        }
        return prev;
    }
}
