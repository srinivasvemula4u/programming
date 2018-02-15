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

    public static LinkedListsNode rotateLinkedListByKPositions(LinkedListNode head, K) {
        LinkedListNode nthNodeFromEnd = NthNodeFromEndOfList(head, k);
        LinkedListNode current = nthNodeFromEnd;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return nthNodeFromEnd;
    }
}
