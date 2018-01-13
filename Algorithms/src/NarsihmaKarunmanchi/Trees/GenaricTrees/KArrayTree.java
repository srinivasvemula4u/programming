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
public class KArrayTree {

    public KArrayTreeNode buildKArrayTree(int A[], int n, int k, int ind) {
        if (n <= 0) {
            return null;
        }
        KArrayTreeNode newNode = new KArrayTreeNode(k);
        if (null == newNode) {
            System.out.println("Out of Memory\n");
            return null;
        }
        newNode.setData(A[ind]);
        for (int i = 0; i < k; i++) {
            if (k * ind + i < n) {
                ind++;
                newNode.setChildNode(buildKArrayTree(A, n, k, ind), i);
            } else {
                newNode.setChildNode(null, i);
            }
        }
        return newNode;
    }
}
