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
public class DisplayListFromEnd {
    public static void displayListFromEnd(LinkedListNode head) {
        if(head == null)
            return;
        displayListFromEnd(head.getNext());
        System.out.println(head.getData());
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        displayListFromEnd(list.getHead());
    }
}
