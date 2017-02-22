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
public class QuickUnion {

    private int[] data;
    private int count;

    public QuickUnion(int N) {
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

    void printComponents() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Object = " + i + "     " + "id =" + data[i]);
        }
    }

    public int find(int p) {
       while(p != data[p])
           p = data[p];
       return p;
    }
     public int fastfind(int p) {
      if(p != data[p])
         data[p] = fastfind(data[p]);
       return data[p];
    }
    public void union(int p, int q)
    {
        int pid = find(p);
        int qid = find(q);
        if( pid == qid)
            return ;
        data[pid] = qid;
    }
     public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = 10; // Read number of sites.
        QuickUnion uf = new QuickUnion(N); // Initialize N components.
        uf.union(2, 4);
     
       uf.union(2, 9);
       uf.union(9, 8);
         uf.union(8, 0);
//        uf.union(0, 6);
//        uf.union(8, 7);
//        uf.union(3, 9);
        System.out.println(uf.isConnected(0,1));
      
        //System.out.println(qfUF.isConnected(2, 3));
        uf.printComponents();
        System.out.println(uf.fastfind(2));
        uf.printComponents();
//        uf.union(0, 1);
//         uf.printComponents();
    }
     
}
