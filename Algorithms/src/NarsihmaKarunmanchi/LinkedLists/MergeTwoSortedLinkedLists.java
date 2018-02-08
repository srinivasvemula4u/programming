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
public class MergeTwoSortedLinkedLists {

    public static LinkedListNode mergeTwoSortedLinkedList(LinkedListNode head1, LinkedListNode head2) {
        if (head1 == null) {
            return head1;
        }
        if (head2 == null) {
            return head2;
        }
        if (head1.getData() < head2.getData()) {
            head1.setNext(mergeTwoSortedLinkedList(head1, head2.getNext()));
            return head1;
        } else {
            head2.setNext(mergeTwoSortedLinkedList(head1.getNext(), head2));
            return head2;
        }
        //return null;
    }

    public static void main(String[] args) {

    }
}
