/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author srivemul
 */
public class SiblingBinaryTreeNode {

    private int data;
    private SiblingBinaryTreeNode left;
    private SiblingBinaryTreeNode right;
    private SiblingBinaryTreeNode nextSibiling;

    public SiblingBinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.nextSibiling = null;
    }

    public SiblingBinaryTreeNode(int data, SiblingBinaryTreeNode left, SiblingBinaryTreeNode right, SiblingBinaryTreeNode nextSibiling) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.nextSibiling = nextSibiling;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SiblingBinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(SiblingBinaryTreeNode left) {
        this.left = left;
    }

    public SiblingBinaryTreeNode getRight() {
        return right;
    }

    public void setRight(SiblingBinaryTreeNode right) {
        this.right = right;
    }

    public SiblingBinaryTreeNode getNextSibiling() {
        return nextSibiling;
    }

    public void setNextSibiling(SiblingBinaryTreeNode nextSibiling) {
        this.nextSibiling = nextSibiling;
    }

    public boolean isLeaf() {
        return (getLeft() == null) && (getRight() == null);
    }

}
