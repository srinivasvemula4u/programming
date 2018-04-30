/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.MicroSoft;

import NarsihmaKarunmanchi.Trees.BinarySearchTrees.BinarySearchTreeNode;

/**
 *
 * @author sv186040
 */
public class SecondLargestNumberInBinarySearchTree {

    BinarySearchTreeNode getSecondLargest(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return null;
        }
        return null;
    } 
}
