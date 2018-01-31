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
public class FindLoopExistsInLinkedList {

    public boolean findLoopExistOrNotInList(LinkedListNode head) {
        LinkedListNode fastPtr = head, slowPtr = head;
        while (fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }
}
