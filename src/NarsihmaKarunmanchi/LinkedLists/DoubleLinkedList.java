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
public class DoubleLinkedList {

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DoubleLinkedListNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkedListNode head) {
        this.head = head;
    }

    private int length;
    private DoubleLinkedListNode head;

    public DoubleLinkedList() {
        head = null;
        length = 0;
    }

    private synchronized DoubleLinkedListNode createNode(int data) {
        DoubleLinkedListNode node = new DoubleLinkedListNode(data);
        return node;
    }

    public synchronized void insertAtBegin(int newValue) {
        DoubleLinkedListNode node = createNode(newValue);
        if (head == null) {
            head = node;
            length++;
            return;
        }
        node.setNext(head);
        node.setPrevious(null);
        head.setPrevious(node);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(int newValue) {
        DoubleLinkedListNode node = createNode(newValue);
        if (head == null) {
            head = node;
            return;
        }
        DoubleLinkedListNode currentNode = head; //previousNode = null;
        while (currentNode.getNext() != null) {
            //previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        node.setPrevious(currentNode);
        node.setNext(null);
        currentNode.setNext(node);
        length++;
    }

    public synchronized void insert(int data, int position) {
        if (position > length) {
            position = length;
        }
        if (position < 0) {
            position = 0;
        }
        DoubleLinkedListNode node = createNode(data);
        if (0 == position) {
            insertAtBegin(data);
        } else if (position == length) {
            insertAtEnd(data);
        } else if (position > 0 && position < length) {
            DoubleLinkedListNode currentNode = head;
            DoubleLinkedListNode previousNode = null;
            for (int i = 0; i < position; i++) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            node.setPrevious(previousNode);
            node.setNext(currentNode);
            previousNode.setNext(node);
            currentNode.setPrevious(node);
            length++;
        }
    }

    public synchronized DoubleLinkedListNode removeFromBegin() {
        DoubleLinkedListNode currentNode = head;
        if (currentNode == null) {
            return null;
        }
        head = head.getNext();
        head.setPrevious(null);
        currentNode.setNext(null);
        length--;
        return currentNode;
    }

    public synchronized DoubleLinkedListNode removeFromEnd() {
        DoubleLinkedListNode currentNode = head;
        DoubleLinkedListNode previousNode = null;
        if (currentNode == null) {
            return null;
        }
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(null);
        currentNode.setPrevious(null);
        length--;
        return currentNode;
    }

    public synchronized DoubleLinkedListNode remove(int position) {
        DoubleLinkedListNode currentNode = head;
        DoubleLinkedListNode previousNode = null;
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
            for (int i = 0; i < position; i++) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            previousNode.setNext(currentNode.getNext());
            currentNode.setPrevious(null);
            currentNode.getNext().setPrevious(previousNode);
            currentNode.setNext(null);
            length--;
        }
        return currentNode;
    }

    public synchronized void removeMatched(DoubleLinkedListNode node) {
        if (head == null) {
            return;
        }
        if (node.equals(head)) {
            head = head.getNext();
            head.setPrevious(null);
        }
        DoubleLinkedListNode currentNode = head, previousNode = null;
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            if (currentNode.equals(node)) {
                previousNode.setNext(currentNode.getNext());
                currentNode.setPrevious(null);
                if (currentNode.getNext().getPrevious() != null) {
                    currentNode.getNext().setPrevious(previousNode);
                }
                currentNode.setNext(null);
                length--;
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        DoubleLinkedListNode currentNode = head;
        while (currentNode != null) {
            result = result + " " + currentNode.getData();
            currentNode = currentNode.getNext();
        }
        result = result + " ]";
        return result;
    }

    public int length() {
        return length;
    }

    public synchronized int getPosition(int data) {
        int position = 0;
        if (head == null) {
            return -1;
        }
        DoubleLinkedListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return position;
            }
            position++;
            currentNode = currentNode.getNext();
        }
        return position;
    }

    public void clearList() {
        head = null;
        length = 0;
    }

    public synchronized void reverseIterative() {
        DoubleLinkedListNode previous = null;
        DoubleLinkedListNode current = head;
        if (head == null) {
            return;
        }
        while (head != null) {
            current = head.getNext();
            head.setNext(previous);
            head.setPrevious(current);
            previous = head;
            head = current;

        }
        head = previous;
    }

    public synchronized DoubleLinkedListNode reverseRecursive(DoubleLinkedListNode head) {
        DoubleLinkedListNode previous = null;
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            this.head = head;
        }
        previous = reverseRecursive(head.getNext());
        if (previous != null) {
            previous.setNext(head);
            // head.setPrevious(previous);
        }
        if (head != null) {
            head.setNext(null);
            head.setPrevious(previous);
        }
        return head;
    }

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insert(10, 0);
        list.insert(11, 1);
        list.insert(12, 2);
        list.insert(13, 3);
        list.insert(14, 4);
        list.insert(15, 5);
        //  list.insert(16, 3);
        //   list.insert(17, 0);
         list.insert(16, 6);
        for(int i = 7; i < 10000; i++)
        {
            list.insert(i+10, i);
        }
        System.out.println(list);
         list.reverseIterative();
       // DoubleLinkedListNode node = list.getHead();
      //  list.reverseRecursive(node);
        // list.remove(3);
        // list.remove(0);
        System.out.println(list);
        System.out.println("list " + list.getHead().getPrevious());
    }
}
