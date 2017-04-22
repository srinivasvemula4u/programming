/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.AVLTrees;

import NarsihmaKarunmanchi.LinkedLists.LinkedListNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class ConnectAdjacentNodesInAVL {

    /**
     * @param args the command line arguments
     */
    public static void connectAdjacentNodes(AVLTreeNode root) {
        if(root == null)
            return;
        LinkedListNode levelNode = null,levelHead = null;
        Queue<AVLTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()) {
            AVLTreeNode temp = queue.poll();
            if(temp!= null) {
               if(temp.getLeft() != null)
                   queue.offer(temp.getLeft());
               if(temp.getRight() != null)
                   queue.offer(temp.getRight());
              if(levelNode != null)
              {
                  LinkedListNode tempNode = new LinkedListNode(temp.getData());
                  levelNode.setNext(tempNode);
                  levelNode = levelNode.getNext();
              } else {
                  levelNode = new LinkedListNode(temp.getData());
                  levelHead = levelNode;
              }
            } else {
                printLevelNodes(levelHead);
                if(!queue.isEmpty()) {
                    levelNode = null;
                    queue.offer(null);
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
         AVLTree tree = new AVLTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(5);
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(6);
        connectAdjacentNodes(tree.getRoot());
    }

    private static void printLevelNodes(LinkedListNode levelNode) {
        LinkedListNode current = levelNode;
        while(current != null) {
            System.out.print (current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
}
