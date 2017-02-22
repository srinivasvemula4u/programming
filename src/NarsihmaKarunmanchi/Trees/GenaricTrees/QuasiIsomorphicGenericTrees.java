/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees.GenaricTrees;

import NarsihmaKarunmanchi.Trees.BinaryTreeNode;

/**
 *
 * @author srivemul
 */
/*
Two tress root1 and root2 are qusai isomorphic if root1 cane be transformed into root2 by swapping left 
and right children of some of the nodes of root1. Data in the nodes are not imo
*/
public class QuasiIsomorphicGenericTrees {
    public static boolean quasiIsomorphicGenericTrees(BinaryTreeNode root1, BinaryTreeNode root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if((root1 == null && root2 != null) ||(root1 != null && root2 == null))
            return false;
        return (quasiIsomorphicGenericTrees(root1.getLeft(), root2.getLeft())&&quasiIsomorphicGenericTrees(root1.getRight(), root2.getRight()))
                || (quasiIsomorphicGenericTrees(root1.getLeft(), root2.getRight()) && quasiIsomorphicGenericTrees(root1.getRight(), root2.getLeft())); 
    }
}
