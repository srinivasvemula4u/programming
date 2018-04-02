/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.ThreadedBinaryTrees;

/**
 *
 * @author srivemul
 */
/*
For Inorder Threaded Binary Tree
if LTag = 0 : Left Pointer Points to the In Order predecessor
if LTag = 1  : Left Pointer Point to the Left Child
if RTag = 0 : Right Pointer Points to the In Order Successor
if RTag = 1 : Right Pointer Points to the right child.

What Should leftmost and right most pointers point to?

In the representation of a threaded binary tree, It is convenient to use a special node Dummy which is always present even for an
empty tree. Note that right tag of dummy node is 1 and its right child points to itself.

left tag will be 0 if the tree is empty and its left pointer points to itself.
left tag will be 1 if the tree is not empty and its left pointer points to tree.
 */
public class ThreadedBinaryTreeNode {

    private int LTag;
    private int data;
    private int RTag;
    private ThreadedBinaryTreeNode left;
    private ThreadedBinaryTreeNode right;

    public ThreadedBinaryTreeNode(int data) {
        this.data = data;

    }

    public int getLTag() {
        return LTag;
    }

    public void setLTag(int LTag) {
        this.LTag = LTag;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getRTag() {
        return RTag;
    }

    public void setRTag(int RTag) {
        this.RTag = RTag;
    }

    public ThreadedBinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(ThreadedBinaryTreeNode left) {
        this.left = left;
    }

    public ThreadedBinaryTreeNode getRight() {
        return right;
    }

    public void setRight(ThreadedBinaryTreeNode right) {
        this.right = right;
    }

}
