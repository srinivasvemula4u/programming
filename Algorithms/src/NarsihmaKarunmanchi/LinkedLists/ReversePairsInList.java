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
public class ReversePairsInList {

    public static void main(String[] args) {

    }

    public static LinkedListNode reversePairsInListRecursive(LinkedListNode head) {
        if (head == null) {
            return null;
        }
        LinkedListNode temp = null;
        temp = head.getNext();
        head.setNext(temp.getNext());
        temp.setNext(head);
        head = temp;
        head.getNext().setNext(reversePairsInListRecursive(head.getNext().getNext()));
        return head;
    }
}
