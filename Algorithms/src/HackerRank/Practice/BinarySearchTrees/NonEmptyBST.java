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
class NonEmptyBST<D extends Comparable<D>> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<>();
        right = new EmptyBST<>();
    }

    private NonEmptyBST(D elt, Tree<D> left, Tree<D> right) {
        data = elt;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
      return 1+left.cardinality()+right.cardinality();
    }

    @Override
    public boolean member(D elt) {
       if(data == elt)
           return true;
       if(elt.compareTo(data) < 0)
           return left.member(elt);
       else 
           return right.member(elt);
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        if(data == elt)
            return this;
         if(elt.compareTo(data) < 0)
             return new NonEmptyBST<D>(elt,left.add(elt),right);
         else 
             return new NonEmptyBST<D>(elt,left,right.add(elt));
        
      }

}
