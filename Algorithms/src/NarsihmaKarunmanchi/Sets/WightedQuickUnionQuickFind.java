/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sets;

/**
 *
 * @author srivemul
 */
public class WightedQuickUnionQuickFind {

    private int[] data;
    private int count;
    private int[] size;

    public WightedQuickUnionQuickFind(int N) {
        data = new int[N];
        count = N;
        size = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = i;
            size[i] = 1;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    void printComponents() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Object = " + i + "     " + "id =" + data[i]);
        }
    }

    public int find(int p) {
        while (p != data[p]) {
            p = data[p];
        }
        return p;
    }
    public void union(int p,int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot)
            return;
        if(size[pRoot] < size[qRoot])
        {
            data[pRoot] = qRoot;
            size[qRoot] += size[pRoot];  
        }
        else
        {
            data[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }
        count--;
    }
    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = 10; // Read number of sites.
        WightedQuickUnionQuickFind wf = new WightedQuickUnionQuickFind(N); // Initialize N components.
        wf.union(2, 4);
       wf.union(8, 0);
       wf.union(2, 9);
//        uf.union(0, 6);
//        uf.union(8, 7);
//        uf.union(3, 9);
        System.out.println(wf.isConnected(0,1));

        //System.out.println(qfUF.isConnected(2, 3));
        wf.printComponents();
//        uf.union(0, 1);
//         uf.printComponents();
    }
}
