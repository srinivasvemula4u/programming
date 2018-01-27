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
public class LinkedList {

    private LinkedListNode head;
    private int length;
    private LinkedListNode recursivePrevious;

    public LinkedList() {
        length = 0;
        recursivePrevious = null;
    }

    private LinkedListNode createNode(int n) {
        return new LinkedListNode(n);
    }

    public synchronized LinkedListNode getHead() {
        return head;
    }

    public int linkedListLength(LinkedListNode headNode) {
        int count = 0;
        LinkedListNode currentNode = headNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public synchronized void insertAtBegin(LinkedListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtLast(LinkedListNode node) {
        if (null == head) {
            head = node;
        } else {
            LinkedListNode previous = null;
            LinkedListNode current = head;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(node);
            length++;
        }
    }
    // Inserting node at given position
    public synchronized void insert(int data, int position) {
        if (position < 0) {
            position = 0;
        } else if (position > length) {
            position = length;
        }
        LinkedListNode node = null;
        if (position == 0) {
            node = createNode(data);
            insertAtBegin(node);
        } else if (position == length) {
            node = createNode(data);
            insertAtLast(node);
        } else if (position > 0 && position < length) {
            LinkedListNode current = head;
            LinkedListNode previous = null;
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.getNext();
            }
            node = createNode(data);
            node.setNext(current);
            previous.setNext(node);
            length++;
        }

    }

    // Deleting in Linked List
    public synchronized LinkedListNode removeFromBegin() {
        LinkedListNode node = head;
        if (node == null) {
            return null;
        } else {
            head = node.getNext();
            node.setNext(null);
        }
        length--;
        return node;
    }

    public synchronized LinkedListNode removeFromEnd() {
        LinkedListNode current = head;
        LinkedListNode previous = null;
        if (current == null) {
            return null;
        } else {
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            length--;
        }
        return current;
    }

    public synchronized void removeMatched(LinkedListNode node) {
        if (head == null) {
            return;
        }
        if (node.equals(head)) {
            head = head.getNext();
        }
        LinkedListNode current = head, previous = null;
        while (current.getNext() != null) {
            previous = current;
            if (current.equals(node)) {
                previous.setNext(current.getNext());
                current.setNext(null);
                length--;
                return;
            }
            current = current.getNext();
        }
    }

    public synchronized LinkedListNode remove(int position) {
        if (position < 0) {
            position = 0;
        } else if (position > length) {
            position = length;
        }
        if (position == 0) {
            return removeFromBegin();
        } else if (position == length) {
            return removeFromEnd();
        } else if (position > 0 && position < length) {
            LinkedListNode current = head;
            LinkedListNode previous = null;
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            length--;
            return current;
        }
        return null;
    }

    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        LinkedListNode current = head;
        while (current != null) {
            result = result + " " + current.getData();
            current = current.getNext();
        }
        result = result + " ]";
        return result;
    }

    public int length() {
        return length;
    }

    public int getPosition(int data) {
        int position = 0;
        if (head == null) {
            return -1;
        }
        LinkedListNode current = head;
        while (current != null) {
            if (current.getData() == data) {
                return position;
            }
            position++;
            current = current.getNext();
        }
        return position;
    }

    public void clearList() {
        head = null;
        length = 0;
    }

    // Iterative version
    public synchronized void reverseIterative() {
        LinkedListNode current = head;
        LinkedListNode previous = null;
        if (head == null) {
            return;
        }
        while (head != null) {
            current = head.getNext();
            head.setNext(previous);
            previous = head;
            head = current;
        }
        head = previous;
    }
    // Recursive approach
    public synchronized LinkedListNode reverseRecursive(LinkedListNode head) {
        LinkedListNode previous = null;
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            this.head = head;
        }
        previous = reverseRecursive(head.getNext());
        if (previous != null) {
            previous.setNext(head);
        }
        if (head != null) {
            head.setNext(null);
        }
        return head;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
       // list.insert(16, 6);
//        for(int i = 7; i < 50; i++)
//        {
//            list.insert(i+10, i);
//        }
        System.out.println(list);
        //  list.remove(3);
        // list.remove(0);
        LinkedListNode node = list.getHead();
        list.reverseRecursive(node);
        System.out.println(list);
        System.out.println(list.length());
        //   list.remove(list.length());
        // System.out.println(list);node
    }

}
