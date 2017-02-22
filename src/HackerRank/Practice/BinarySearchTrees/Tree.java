/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice.BinarySearchTrees;

/**
 *
 * @author srivemul
 */
public interface Tree<D extends Comparable<D>>{
    public boolean isEmpty();
    public int cardinality(); // Size of the tree
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
