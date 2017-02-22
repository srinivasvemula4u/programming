/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author srivemul
 */
public class PrintingMatrixValuesInSpiral {
    public static void main(String args[]) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length;
        int n = arr[0].length;
        int rowstart = 0;
        int rowend = m-1;
        int colstart = 0;
        int colend= n-1;
        while((rowstart <= rowend) && (colstart  <= colend)) {
            int i = rowstart, j = colstart;
            for(j = colstart; j <= colend; j++ )
                System.out.print(" "+arr[i][j]);
            for( i = rowstart+1, j--; i <= rowend; i++)
                System.out.print(" "+arr[i][j]);
            for( j = colend-1, i--; j >= colstart; j--) {
                System.out.print(" "+arr[i][j]);
            }
            for( i = rowend -1, j++; i >= rowstart+1; i--) 
                System.out.print(" "+arr[i][j]);
            rowstart++;
            colstart++;
            rowend--;
            colend--;
            
        }
    }
}
