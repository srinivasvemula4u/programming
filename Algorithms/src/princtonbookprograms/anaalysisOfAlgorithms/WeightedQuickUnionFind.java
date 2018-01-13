/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms;

/**
 *
 * @author srivemul
 */
public class WeightedQuickUnionFind {
    private int[] id;
    private int[] size;
    private int count;
    public WeightedQuickUnionFind(int N)
    {
        id = new int[N];
        count = N;
        size = new int[N];
        for(int i=0; i< N; i++)
        {
            id[i] = i;
            size[i] = 1;
        }
    }
    public int Count()
    {
        return count;
    }
    public boolean  Connected(int p, int q )
    {
        return find(p) == find(q);
    }
    public int find(int p)
    {
        while(p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q)
    {
        int proot = find(p);
        int qroot = find(q);
        if( proot == qroot)
            return;
        if(size[proot] < size[qroot])
        {
            id[proot] =qroot;
            size[qroot] += size[proot];
        }
        else
        {
            id[qroot] = proot;
            size[proot] += size[qroot];
        }
        count--;
        
    }
    public void printComponents() {
        for (int i = 0; i < id.length; i++) {
            System.out.println("Object = " + i + "     " + "id =" + id[i]);
        }
    }
    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = 10; // Read number of sites.
        WeightedQuickUnionFind uf = new WeightedQuickUnionFind(N); // Initialize N components.
        uf.union(2, 4);
       uf.union(8, 0);
       uf.union(2, 9);
       uf.union(0, 2);
//        uf.union(8, 7);
//        uf.union(3, 9);
        System.out.println(uf.Connected(0,1));

        //System.out.println(qfUF.isConnected(2, 3));
        uf.printComponents();
//        uf.union(0, 1);
//         uf.printComponents();
    }
}
