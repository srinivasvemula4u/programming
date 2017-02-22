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
public class EmptyBST<D extends Comparable<D>> implements Tree<D>{

   
    @Override
    public boolean isEmpty() {
       return false;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
       return new NonEmptyBST<D>(elt);
    }
    
}
