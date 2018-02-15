/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sv186040
 */
public class RemoveDuplicatesInList {

    public static LinkedListNode removeDuplicatesInList(LinkedListNode head) {
        LinkedListNode current = head, prev = null;
        Map<Integer, Boolean> map = new HashMap<>();
        while (current != null) {
            if (map.get(current.getData()) == null) {
                map.put(current.getData(), Boolean.TRUE);
                prev = current;

            } else {
                prev.setNext(current.getNext());
            }
            current = current.getNext();
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(5, 1);
        list.insert(4, 1);
        list.insert(3, 2);
        list.insert(2, 3);
        list.insert(5, 4);
        list.insert(2, 5);
        LinkedListNode head = removeDuplicatesInList(list.getHead());
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}
