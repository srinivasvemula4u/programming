/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.GenaricTrees;

/**
 *
 * @author srivemul
 */
public class ChildFirstSiblingNextTreeNode {
    private int data;
    private ChildFirstSiblingNextTreeNode firstChild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ChildFirstSiblingNextTreeNode getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(ChildFirstSiblingNextTreeNode firstChild) {
        this.firstChild = firstChild;
    }

    public ChildFirstSiblingNextTreeNode getNextSibiling() {
        return nextSibiling;
    }

    public void setNextSibiling(ChildFirstSiblingNextTreeNode nextSibiling) {
        this.nextSibiling = nextSibiling;
    }
    private ChildFirstSiblingNextTreeNode nextSibiling;
    
}