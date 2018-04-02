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
public class FindDepthInGenericTress {

    /* Given a Parent array P, Where p[i] indicates the parent of ith node in the tree(Assume parent of root node is indicated with -1)
    Give an algorithm finding the height or depth of the tree.
     */
    public static int findDepthInGenericTrees(int[] P) {
        int maxDepth = -1, currentDepth = -1, j;
        for (int i = 0; i < P.length; i++) {
            currentDepth = 0;
            j = i;
            while (P[j] != -1) {
                currentDepth++;
                j = P[j];
            }
            if (maxDepth < currentDepth) {
                maxDepth = currentDepth;
            }
        }
        return maxDepth;
    }

    public static void main(String args[]) {
        System.out.println(findDepthInGenericTrees(new int[]{-1, 0, 1, 6, 6, 0, 0, 2, 7}));
    }
}
