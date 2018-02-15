/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author Srinivas
 */
/*
Given a Linked List and a value K, partition it such that all nodes less than K come before
Nodes greater than or equal to K. You should preserve the original relative order of the nodes in each of
two partitiond, For example given 1-4-3-2-5-2 k = 3 return 1-2-2-4-3-5
 */
public class RearrangeListBasedonKValue {

    public static LinkedListNode rearrangeListBasedonKValue(LinkedListNode head, int k) {
        LinkedListNode frontList = null, rearList = null, fL = null, rL = null;
        LinkedListNode current = head;
        while (current != null) {
            if (current.getData() < k) {
                if (frontList == null) {
                    frontList = current;
                    fL = frontList;
                    //frontList.setNext(null);
                } else {
                    fL.setNext(current);
                    fL = fL.getNext();
                    // frontList.setNext(null);
                }
            } else {
                if (rearList == null) {
                    rearList = current;
                    rL = rearList;
                    //rearList.setNext(null);
                } else {
                    rL.setNext(current);
                    rL = rL.getNext();
                    //rearList.setNext(null);
                }
            }
            current = current.getNext();

        }
        fL.setNext(rearList);
        rL.setNext(null);
        head = frontList;
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(4, 1);
        list.insert(3, 2);
        list.insert(2, 3);
        list.insert(5, 4);
        list.insert(2, 5);
        LinkedListNode head = rearrangeListBasedonKValue(list.getHead(), 3);
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}
