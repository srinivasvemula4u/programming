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
public class UnionFind {

    private int[] data;
    private int count;

    public UnionFind(int N) {
        data = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return data[p];
    }

    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == pid) {
                data[i] = qid;
            }
        }
        count--;
    }

    void printComponents() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Object = " + i + "     " + "id =" + data[i]);
        }
    }
     public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = 10; // Read number of sites.
        UnionFind uf = new UnionFind(N); // Initialize N components.
        uf.union(2, 4);
       uf.union(8, 0);
      uf.union(2, 9);
//        uf.union(0, 6);
//        uf.union(8, 7);
//        uf.union(3, 9);
        System.out.println(uf.isConnected(0,1));

        //System.out.println(qfUF.isConnected(2, 3));
        uf.printComponents();
//        uf.union(0, 1);
//         uf.p
}
}
