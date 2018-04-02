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
public class ChilCountGenericTrees {

    public static int childCount(ChildFirstSiblingNextTreeNode root) {
        int count = 0;
        ChildFirstSiblingNextTreeNode childNode = root.getFirstChild();
        while (childNode != null) {
            count++;
            childNode = childNode.getNextSibiling();
        }
        return count;
    }
}
