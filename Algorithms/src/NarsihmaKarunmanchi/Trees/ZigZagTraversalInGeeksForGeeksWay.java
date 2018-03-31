/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author sv186040
 *
 * Write a function to print ZigZag order traversal of a binary tree. For the
 * below binary tree the zigzag order traversal will be 1 3 2 7 6 5 4 This
 * problem can be solved using two stacks. Assume the two stacks are current:
 * currentlevel and nextlevel. We would also need a variable to keep track of
 * the current level order(whether it is left to right or right to left). We pop
 * from the currentlevel stack and print the nodes value. Whenever the current
 * level order is from left to right, push the nodes left child, then its right
 * child to the stack nextlevel. Since a stack is a LIFO(Last-In-First_out)
 * structure, next time when nodes are popped off nextlevel, it will be in the
 * reverse order. On the other hand, when the current level order is from right
 * to left, we would push the nodes right child first, then its left child.
 * Finally, do-not forget to swap those two stacks at the end of each
 * level(i.e., when current level is empty)
 *
 * Below is the implementation of the above approach:
 *
 *
 */
public class ZigZagTraversalInGeeksForGeeksWay {

}
