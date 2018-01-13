/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import static NarsihmaKarunmanchi.Trees.FindingHeightOfTree.findingHeightOfTree;

/**
 *
 * @author srivemul
 */
public class WidthOfBinaryTree {
    public static int widthOfBinaryTree(BinaryTreeNode root)
    {
       int max = 0;
       int height = findingHeightOfTree(root);
       for(int i=0; i< height; i++)
       {
           int temp = width(root,i);
           if(temp > max) max = temp;
       }
       return max;
    }
    public static int width(BinaryTreeNode root, int depth)
    {
       if(root == null)
           return 0;
       else  {
           if(depth == 0)
           return 1;
           else
               return width(root.getLeft(), depth-1)+width(root.getRight(), depth-1);
       }
                 
    }
     public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        //tree.insert(7);
        //  tree.insert(8);
        //  tree.insert(9);
        System.out.println("Width of the tree is " + widthOfBinaryTree(tree.getRoot()));
        //System.out.println("Height of the tree is " + findingHeightOfTreeWithStack(tree.getRoot()));
        //System.out.println("Height of the tree is " + findingHeightOfTreeWithQueue(tree.getRoot()));
    }
}
