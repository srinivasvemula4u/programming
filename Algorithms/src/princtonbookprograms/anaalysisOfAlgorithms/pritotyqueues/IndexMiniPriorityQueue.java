/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.pritotyqueues;

/**
 *
 * @author srivemul
 */
public class IndexMiniPriorityQueue<Key extends Comparable<Key>> {

    /*
    IndexMinPQ(int maxN) create a priority queue of capacity maxN
                                           with possible indices between 0 and maxN-1
void insert(int k, Item item) insert item ; associate it with k
void change(int k, Item item) change the item associated with k to item
boolean contains(int k) is k associated with some item?
void delete(int k) remove k and its associated item
Item min() return a minimal item
int minIndex() return a minimal item’s index
int delMin() remove a minimal item and return its index
boolean isEmpty() is the priority queue empty?
int size() number of items in the priority queue
API for a generic priority queue with associated indices
320 CHAPTER 2 ■ Sorting
     */

    private int N; //// number of elements on PQ
    private int[] pq; //// binary heap using 1-based indexing
    private int[] qp; //inverse: qp[pq[i]] = pq[qp[i]] = i
    Key[] keys; //items with priorities

    public IndexMiniPriorityQueue(int maxN) {
        keys = (Key[]) new Comparable[maxN + 1];
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];
        for (int i = 0; i < qp.length; i++) {
            qp[i] = -1;
        }

    }

    public boolean contains(int k) {
        return qp[k] != -1;
    }

    boolean isEmpty() {
        return N == 0;
    }
    void insert(int k, Key key)
    {
        N++;
        qp[k] = N;
        pq[N] = k;
        keys[k] = key;
        swim(N);
 
    }

    private void swim(int N) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
