/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import NarsihmaKarunmanchi.LinkedLists.LinkedList;
import NarsihmaKarunmanchi.LinkedLists.LinkedListNode;

/**
 *
 * @author srivemul
 */
public class ConvertSingleLinkedListTOBST {

    public static BinarySearchTreeNode convertSortedSingleLinkedListToBST(LinkedListNode head, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        BinarySearchTreeNode left = convertSortedSingleLinkedListToBST(head, start, mid - 1);
        BinarySearchTreeNode node = new BinarySearchTreeNode(head.getData());
        node.setLeft(left);
        if(head.getNext() != null) {
        head.setData(head.getNext().getData());
        head.setNext(head.getNext().getNext());
        }
        BinarySearchTreeNode right = convertSortedSingleLinkedListToBST(head, mid + 1, end);
        node.setRight(right);
        return node;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        list.insert(3, 3);
        list.insert(4, 4);
        list.insert(5, 5);
        list.insert(6, 6);
        list.insert(7, 7);
     //   System.out.println(list);
        BinarySearchTreeNode root = convertSortedSingleLinkedListToBST(list.getHead(), 0, getLengthOfList(list.getHead()) - 1);
        BinarySearchTree.inOrderTraversal(root);
      //  System.err.print("           ");
    }

    private static int getLengthOfList(LinkedListNode head) {
        int len = 0;
        LinkedListNode currentNode = head;
        while (currentNode != null) {
            len++;
            currentNode = currentNode.getNext();
        }
        return len;
    }

}
