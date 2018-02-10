/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author sv186040 1) Store the mid and last pointers of the circular linked
 * list using Floyd cycle finding algorithm. 2) Make the second half circular
 * 3)Make the first half circular 4) Set head pointers of the two linked lists
 */
public class SplitCircularLinkedListIntoTwo {

    public static void splitListIntoTwo(LinkedListNode head, LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode fastPtr = head, slowPtr = head;
        while (fastPtr.getNext() != head && fastPtr.getNext().getNext() != head) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
        }
        if (fastPtr.getNext().getNext() == head) {
            fastPtr = fastPtr.getNext();
        }
        if (slowPtr.getNext() != head) {
            head2 = slowPtr.getNext();
        }
        fastPtr.setNext(head2);
        head1 = head;
        slowPtr.setNext(head1);
    }
}
