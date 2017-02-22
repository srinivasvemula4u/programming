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
public class DoubleLinkedListNode {
    private int data;
    private DoubleLinkedListNode previous;
    private DoubleLinkedListNode next;

    public DoubleLinkedListNode(int data, DoubleLinkedListNode previous, DoubleLinkedListNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    public DoubleLinkedListNode(int data)
    {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedListNode previous) {
        this.previous = previous;
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }
    
}
