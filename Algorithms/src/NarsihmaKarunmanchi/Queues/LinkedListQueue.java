/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import NarsihmaKarunmanchi.LinkedLists.LinkedListNode;

/**
 *
 * @author sv186040
 */
public class LinkedListQueue {

    private int length;
    private LinkedListNode front, rear;

    public LinkedListQueue() {
        length = 0;
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        LinkedListNode node = new LinkedListNode(data);
        if (isEmpty()) {
            front = node;
            //rear = node;
        } else {
            rear.setNext(node);

        }
        rear = node;//
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int result = front.getData();
        front = front.getNext();
        length--;
        if (isEmpty()) {
            rear = null;
        }
        return result;
    }

    public int size() {
        return length;
    }

    private boolean isEmpty() {
        return (length == 0);
    }
}
