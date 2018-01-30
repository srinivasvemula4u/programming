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
public class NthNodeFromEndOfList {

    public LinkedListNode nthNodeFromEndOfList(LinkedListNode head, int N) {
        LinkedListNode pTemp = head, pNthNode = null;
        for (int i = 1; i < N; i++) {
            if (pTemp != null) {
                pTemp = pTemp.getNext();
            }
        }
        while (pTemp != null) {
            if (pNthNode == null) {
                pNthNode = head;
            } else {
                pNthNode = pNthNode.getNext();
            }
            pTemp = pTemp.getNext();
        }
        if (pNthNode != null) {
            return pNthNode;
        }
        return null;
    }
}
