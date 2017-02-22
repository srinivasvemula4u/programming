/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.AVLTrees;

/**
 *
 * @author srivemul
 */
/*
Given an AVL tree with n integer iterms and  two integers a and b where an b can be any integers
 */
public class RangeCountInAVLTree {

    public static int count = 0;

    public static int rangeCount(AVLTreeNode root, int a, int b) {

        if (root == null) {
            return 0;
        }

        if (root.getData() >= a) {
            int temp = rangeCount(root.getLeft(), a, b);
        }
        if (a <= root.getData() && b >= root.getData()) {
            count += 1;      // count +=  rangeCount(root.getLeft(), a, b) ;       //  count += rangeCount(root.getRight(), a, b);         // count += 1;
        }
        if (root.getData() <= b) {
            int temp = rangeCount(root.getRight(), a, b);
        }
        return count;
    }

    public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        tree.insert(3);
        //  
        tree.insert(1);
        tree.insert(2);
        tree.insert(0);
//      tree.insert(-1);
//        tree.insert(-2);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        //inOrderTraversal(tree.getRoot());
        System.out.println(rangeCount(tree.getRoot(),3 , 5));
    }
}
