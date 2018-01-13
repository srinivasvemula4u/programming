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
public class CircularLinkedList {
    
    public synchronized int CirCularLinkedList(LinkedListNode head)
    {
        LinkedListNode current = head;
        int length = 0;
        while( current.getNext() != head)
        {
            length++;
            current = current.getNext();
        }
        return length;
    }
    public synchronized void PrintCircularLinkedListData(LinkedListNode head)
    {
        LinkedListNode current = head;
        while( current.getNext() != head)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
    
}
