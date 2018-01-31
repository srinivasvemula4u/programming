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
public class FindLengthOfLoopInList {
    public int findLengthOfLoopInList(LinkedListNode head) {
        if (head == null) {
            return -1;
        }
        int count = 0;
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
        if(isLoopExists) {
            do {
            slowPtr = slowPtr.getNext();
            count++;
            } while(slowPtr != fastPtr);
            return count;
        }
        return -1;
    }
}
