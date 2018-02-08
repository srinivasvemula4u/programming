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
public class CheckListLengthEvenOrNot {
    public static boolean checkListLengthEvenOrNot(LinkedListNode head) {
        while(head != null && head.getNext() != null) {
            head = head.getNext().getNext();
        }
        if(head != null)
            return false;
        return true;
    }
      public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
      //  list.insert(15, 5);
        System.out.println(checkListLengthEvenOrNot(list.getHead()));
      }
}
