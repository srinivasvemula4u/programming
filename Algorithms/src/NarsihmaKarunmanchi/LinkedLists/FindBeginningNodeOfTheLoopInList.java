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
public class FindBeginningNodeOfTheLoopInList {

    public LinkedListNode findBeginningNodeOfTheLoopInList(LinkedListNode head) {
        if (head == null) {
            return null;
        }
        LinkedListNode fastPtr = head, slowPtr = head;
        boolean isLoopExists = false;
        while (fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                isLoopExists = true;
                break;
            }
        }
        if (isLoopExists) {
            slowPtr = head;
            while (slowPtr != fastPtr) {
                slowPtr = slowPtr.getNext();
                fastPtr = fastPtr.getNext();
            }
            return slowPtr;
        }
        return null;
    }
}
