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
public class UnionFind {
//    UF(int N)      initialize N sites with integer names (0 to N-1)
//void union(int p, int q) add connection between p and q
//int find(int p) component identifier for p (0 to N-1)
//boolean connected(int p, int q) return true if p and q are in the same component
//int count() number of components

    public UnionFind(int N) {
        id = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int Count() {
        return count;
    }

    public boolean Connected(int p, int q) {
        return (find(p) == find(q));
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
        count--;

    }

    void printComponents() {
        for (int i = 0; i < id.length; i++) {
            System.out.println("Object = " + i + "     " + "id =" + id[i]);
        }
    }
    private int[] id;
    private int count;

    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = 10; // Read number of sites.
        UnionFind uf = new UnionFind(N); // Initialize N components.
        uf.union(2, 4);
       uf.union(8, 0);
       uf.union(2, 9);
//        uf.union(0, 6);
//        uf.union(8, 7);
//        uf.union(3, 9);
        System.out.println(uf.Connected(0,1));

        //System.out.println(qfUF.isConnected(2, 3));
        uf.printComponents();
//        uf.union(0, 1);
//         uf.printComponents();
    }
}
