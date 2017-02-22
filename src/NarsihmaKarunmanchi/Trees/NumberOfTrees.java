/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Trees;

/**
 *
 * @author srivemul
 */
public class NumberOfTrees {
    public static int numberOfTrees(int n)
    {
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for(int i=2; i<=n; i++) 
        {
            for(int j=0; j < i; j++)
                count[i] += count[j]*count[i-j-1];
        }
        return count[n];
    }
     public static void main(String args[]) {
      
         System.out.println(numberOfTrees(3));
     }
}
