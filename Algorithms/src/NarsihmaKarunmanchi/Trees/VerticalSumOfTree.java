/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

import java.util.HashMap;

/**
 *
 * @author srivemul
 */
public class VerticalSumOfTree {

    public static void verticalSumOfTree(BinaryTreeNode root) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        verticalSum(hashMap, root, 0);
        for (int k : hashMap.keySet()) {
            System.out.println("Key(pos) : " + k + " Sum: " + hashMap.get(k) + "");
        }
    }

    private static void verticalSum(HashMap<Integer, Integer> hashMap, BinaryTreeNode root, int c) {
        if (root.getLeft() != null) {
            verticalSum(hashMap, root.getLeft(), c - 1);
        }
        if (root.getRight() != null) {
            verticalSum(hashMap, root.getRight(), c + 1);
        }
        int data = 0;
        if (hashMap.containsKey(c)) {
            data = hashMap.get(c);
        }
        hashMap.put(c, (root.getData() + data));
        
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
//        tree.insert(10);
//        tree.insert(11);
//         tree.insert(12);
//        tree.insert(13);
//        tree.insert(14);
//        tree.insert(15);
//        tree.insert(16);
//        tree.insert(17);
        verticalSumOfTree(tree.getRoot());
    }
}
