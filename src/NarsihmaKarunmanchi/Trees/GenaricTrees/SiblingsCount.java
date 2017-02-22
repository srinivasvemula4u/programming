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
public class SiblingsCount {
    
    public static int sibilingCount(ChildFirstSiblingNextTreeNode siblingNode)
    {
        int count = 0;
        while(siblingNode != null)
        {
            count++;
            siblingNode = siblingNode.getNextSibiling();
        }
        return count;
    }
    
}
