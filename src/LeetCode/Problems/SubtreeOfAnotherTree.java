/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
/*
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure 
and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. 
The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
 */
public class SubtreeOfAnotherTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.val == t.val) {
                flag = findSameTree(temp, t);
            }
            if (flag) {
                return flag;
            }
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return flag;
    }

    private boolean findSameTree(TreeNode s, TreeNode q) {
        if (s == null && q == null) {
            return true;
        }
        if (s == null || q == null) {
            return false;
        }
        return (s.val == q.val) && (findSameTree(s.left, q.left)) && (findSameTree(s.right, q.right));
    }

    public boolean isSubtree2(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return false;
        }
        if (isSame(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }

        if (s.val != t.val) {
            return false;
        }

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

    public boolean isSubtree3(TreeNode s, TreeNode t) {
        return serialize(s).contains(serialize(t));
    }

    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serialize(root, res);
        return res.toString();
    }

    private void serialize(TreeNode cur, StringBuilder res) {
        if (cur == null) {
            res.append(",#");
            return;
        }
        res.append("," + cur.val);
        serialize(cur.left, res);
        serialize(cur.right, res);
    }

}
