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
public class KArrayTreeNode {

    private int data;
    private KArrayTreeNode[] childNode;

    public KArrayTreeNode(int k) {
        childNode = new KArrayTreeNode[k];
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public KArrayTreeNode getChildNode(int i) {
        return childNode[i];
    }

    public void setChildNode(KArrayTreeNode childNode, int i) {
        this.childNode[i] = childNode;
    }

}
