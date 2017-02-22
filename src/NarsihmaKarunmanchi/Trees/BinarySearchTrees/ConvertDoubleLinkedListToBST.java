/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

import NarsihmaKarunmanchi.LinkedLists.DoubleLinkedList;
import NarsihmaKarunmanchi.LinkedLists.DoubleLinkedListNode;
import NarsihmaKarunmanchi.Trees.TreeTravels;

/**
 *
 * @author srivemul
 */
public class ConvertDoubleLinkedListToBST {
    public static BinarySearchTreeNode sortedListToBST(DoubleLinkedListNode head) {
        int len = 0;
        DoubleLinkedListNode currentNode = head;
        if(head == null)
            return null;
        while(currentNode != null)
        {
            len++;
            currentNode = currentNode.getNext();
        }
        return construct(head,0,len-1);
    }

    private static BinarySearchTreeNode construct(DoubleLinkedListNode head, int start, int end) {
        if(start > end)
            return null;
        int mid = start + (end-start)/2;
        BinarySearchTreeNode left = construct(head, start, mid-1);
        BinarySearchTreeNode root = new BinarySearchTreeNode(head.getData());
        root.setLeft(left);
        if(head.getNext() != null)
        {
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
        }
       BinarySearchTreeNode right = construct(head, mid+1, end);
       root.setRight(right);
       return root;
    }
     public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        list.insert(3, 3);
        list.insert(4, 4);
        list.insert(5, 5);
        list.insert(6, 6);
        list.insert(7, 7);
        System.out.println(list);
        BinarySearchTreeNode root = sortedListToBST(list.getHead());
        BinarySearchTree.inOrderTraversal(root);
        System.err.print("           ");
     }
}
