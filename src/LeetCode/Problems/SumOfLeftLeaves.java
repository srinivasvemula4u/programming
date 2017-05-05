/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) 
          return 0;
        int ans = 0;
        if(root.left != null) {
            if( root.left.left == null && root.left.right == null) 
               ans = ans + root.left.val; 
            else 
               ans = ans + sumOfLeftLeaves(root.left);
        }
         ans = ans + sumOfLeftLeaves(root.right);
        return ans;
    }

}
