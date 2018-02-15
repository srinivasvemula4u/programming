/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author sv186040 Given a list rotate the list to the right by K places. Where
 * K is non negative For example: Given 1->2->3->4->5 and k = 2 return
 * 4->5->3->NULL;
 */
public class RotatateLinkedListByKPositions {

    public static LinkedListNode rotateLinkedListByKPositions(LinkedListNode head, int K) {

        if (head == null || head.getNext() == null) {
            return null;
        }
        LinkedListNode rotateStart = head, rotateEnd = head;
        while (K-- > 0) {
            rotateEnd = rotateEnd.getNext();
            if (rotateEnd == null) {
                rotateEnd = head;
            }
        }
        if (rotateStart == rotateEnd) {
            return head;
        }
        while (rotateEnd.getNext() != null) {
            rotateStart = rotateStart.getNext();
            rotateEnd = rotateEnd.getNext();
        }

        LinkedListNode temp = rotateStart.getNext();
        rotateEnd.setNext(head);
        rotateStart.setNext(null);
        head = temp;
        return head;
        // return nthNodeFromEnd;
    }
}
