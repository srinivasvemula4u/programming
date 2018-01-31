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
public class InsertNodeIntoSortedLinkedList {

    public void insertNodeIntoSortedLinkedList(LinkedListNode head, LinkedListNode newNode) {
        LinkedListNode current = head, previous = null;
        while (current != null && current.getData() < newNode.getData()) {
            previous = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        previous.setNext(newNode);
    }
}
