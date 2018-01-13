package HackerRank.Practice.BinarySearchTrees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
public class CatalanNumber {

    /**
     * @param args the command line arguments
     */ static int[] CountBST(int[] nvalues) {
         int[] res = new int[nvalues.length];
          int[] res2 = new int[nvalues.length];
        for(int i=0; i < nvalues.length; i++) {
            int val = catalanDP(nvalues[i]);
        //    int val2 = catalanDP2(nvalues[i]);
         //   res[i] = val;
            res2[i] = val;
        }
         return res2;
    }
     static  int catalanDP( int n)
{
    // Table to store results of subproblems
    long[] catalan= new long[n+1];
 
    // Initialize first two values in table
    catalan[0] = catalan[1] = 1;
 
    // Fill entries in catalan[] using recursive formula
    for (int i=2; i<=n; i++)
    {
        catalan[i] = 0;
        for (int j=0; j<i; j++)
            catalan[i] += catalan[j] * catalan[i-j-1];
    }
 
    // Return last entry
    return (int)(catalan[n] % Integer.MAX_VALUE);
}
  static int catalanDP2(int n) {
      int[] res = new int[n+1];
      return catalnDP2(n, res);
  }

    public static void main(String[] args) {
        // TODO code application logic herearr
        int[] arr = {1,2,3,4,100};
        int[] res = CountBST(arr);
        for(int val : res) {
            System.out.println(val);
        }
    }

    private static int catalnDP2(int n, int[] res) {
        if(res[n] != 0) return res[n];
        long ans  =0;
        if(n == 0)
            ans = 1;
       for(int i = 1; i <= n; i++) {
           ans += catalnDP2(i-1, res)*catalnDP2(n-i, res);
       }
       return res[n] =(int)(ans % Integer.MAX_VALUE);
    }

}
