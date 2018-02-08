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
        LinkedList list1 = new LinkedList();
        list1.insert(10, 0);
        list1.insert(11, 2);
        list1.insert(12, 4);
        list1.insert(13, 6);
        list1.insert(14, 8);
        list1.insert(15, 20);
        
         LinkedList list2 = new LinkedList();
        list2.insert(10, 1);
        list2.insert(11, 3);
        list2.insert(12, 5);
        list2.insert(13, 7);
        list2.insert(14, 9);
        list2.insert(15, 11);
        System.out.println(mergeTwoSortedLinkedList(list1.getHead(), list2.getHead()));

    }
}
