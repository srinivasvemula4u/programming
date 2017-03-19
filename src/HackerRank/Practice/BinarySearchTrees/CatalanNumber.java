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
        for(int i=0; i < nvalues.length; i++) {
            int val = catalanDP(nvalues[i]);
            res[i] = val;
        }
         return res;
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


    public static void main(String[] args) {
        // TODO code application logic herearr
        int[] arr = {1,2,3,4,100};
        int[] res = CountBST(arr);
        for(int val : res) {
            System.out.println(val);
        }
    }

}
