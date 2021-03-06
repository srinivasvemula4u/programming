/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author srivemul
 */
public class DeletingEvenDataNodeFromLinkedList {

    /**
     * @param args the command line arguments
     */
    static LinkedListNode deleteEven(LinkedListNode list) {
        LinkedListNode current = list, prev = null, head = null;
        if (list == null) {
            return null;
        }
        while (current != null) {
            if (current.getData() % 2 == 0) {
                current = current.getNext();

            } else {
                if (prev == null) {
                    prev = current;
                    head = prev;
                } else {
                    prev.setNext(current);
                }
                prev = current;
                current = current.getNext();
            }
        }
        prev.setNext(null);
        return head;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        LinkedListNode head = deleteEven(list.getHead());
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

}
