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
public class NthNodeFromEndOfList {

    private static int counter = 0;

    public static LinkedListNode nthNodeFromEndOfList(LinkedListNode head, int N) {
        LinkedListNode pTemp = head, pNthNode = null;
        for (int i = 1; i < N; i++) {
            if (pTemp != null) {
                pTemp = pTemp.getNext();
            }
        }
        while (pTemp != null) {
            if (pNthNode == null) {
                pNthNode = head;
            } else {
                pNthNode = pNthNode.getNext();
            }
            pTemp = pTemp.getNext();
        }
        if (pNthNode != null) {
            return pNthNode;
        }
        return null;
    }
   //Need to check
    public static LinkedListNode
            nthNodeFromEndOfListRecursive(LinkedListNode head, int N) {
        if (head != null) {
            nthNodeFromEndOfListRecursive(head.getNext(), N);
            counter++;
            if (counter == N) {
                return head;
            }
        }
        return null;

    }

    public static void main(String[] agrs) {
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        LinkedListNode node = nthNodeFromEndOfList(list.getHead(), 1);
        System.out.println(node.getData());
        node = nthNodeFromEndOfListRecursive(list.getHead(), 1);
        System.out.println(node.getData());
    }
}
