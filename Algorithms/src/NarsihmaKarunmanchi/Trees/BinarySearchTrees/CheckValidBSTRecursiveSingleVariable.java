/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public class CheckValidBSTRecursiveSingleVariable {
   public static boolean checkValidBST(BinarySearchTreeNode root) {
       return isBST(root,Integer.MAX_VALUE);
   }
   public static boolean isBST(BinarySearchTreeNode root,int prevNodeVal) {
       if(root == null)
           return true;
       if(!isBST(root.getLeft(), prevNodeVal))
           return false;
       if(root.getData() < prevNodeVal)
              return false;
           prevNodeVal = root.getData();
       return isBST(root.getRight(), prevNodeVal);
   }
    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);

         System.out.println(checkValidBST(tree.getRoot()));
     }
    
}
