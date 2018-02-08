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
public class FindMiddleNodeInList {

    public static LinkedListNode findMiddleNodeInList(LinkedListNode head) {
        LinkedListNode fastPtr = head, slowPtr = head;
        int index = 0;
        while (fastPtr.getNext() != null) {
            if (index == 0) {
                fastPtr=fastPtr.getNext();
                index = 1;
            } else if(index == 1)
            {
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
                index = 0;
            }
        }
        return slowPtr;
    }
}
