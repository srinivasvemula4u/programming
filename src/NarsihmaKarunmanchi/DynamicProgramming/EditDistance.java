/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class EditDistance {
    public static int editDistance(String A, String B) {
        int[][] table = new int[A.length()+1][B.length()+1];
        for(int i =0; i <= A.length(); i++)
            table[i][0] = i;
        for(int i=0; i <= B.length(); i++) {
            table[0][i] = i;
        }
        for(int i=1 ; i <= A.length(); i++) {
            for(int j = 1; j <= B.length(); j++) {
                if(A.charAt(i-1) == B.charAt(j-1))
                    table[i][j] = table[i-1][j-1];
                else 
                    table[i][j] = 1 + Math.min(table[i-1][j-1], Math.min(table[i-1][j], table[i][j-1]));
            }
        }
        printtable(table);
        return table[A.length()][B.length()];
    }
    public static void main(String args[]) {
        System.out.println(editDistance("abc", "acdb"));
    }

    private static void printtable(int[][] table) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int[] val : table) 
        {
            for(int v : val) 
                System.out.print(v+" ");
              System.out.println();
        }
      
    }
}
