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
        LinkedListNode current = head;
        Map<Integer, Boolean> map = new HashMap<>();
        while (current != null) {
            if (map.get(current.getData()) == null) {
                map.put(current.getData(), Boolean.TRUE);
                current = current.getNext();
            } else {
                current.setNext(current.getNext().getNext());
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
