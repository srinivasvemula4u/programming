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
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
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

    public static LinkedListNode reversePairsInList(LinkedListNode head) {
        LinkedListNode temp1 = null, temp2 = null;
        while (head != null && head.getNext() != null) {
            temp1 = head.getNext();
            head.setNext(temp1.getNext());
            temp1.setNext(head);
            if (temp2 == null) {
                temp2 = temp1;
            }
            head = head.getNext();
        }
        return temp2;
    }
}
