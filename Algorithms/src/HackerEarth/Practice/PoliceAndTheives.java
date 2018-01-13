/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerEarth.Practice;

import java.util.Scanner;

/**
 *
 * 
 */
public class PoliceAndTheives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        for (int i = 0; i < T; i++) {
           int N = s.nextInt();
           int K = s.nextInt();
           char[][] grid = new char[N][N];
           boolean[][] policeGrid  = new boolean[N][N];
           for(int j =0; j < N; j++)  {
            for(int k = 0; k < N; k++) {
             grid[j][k] = s.next().charAt(i);
             if(grid[j][k] == 'P')
               policeGrid[j][k] = true;
            }
           }
           System.out.println(findNumberOfThieves(grid,policeGrid,N,K));
        }
    }
     private static int findNumberOfThieves(char[][] grid, boolean[][] policeGrid, int N, int K) {
        int count = 0;
        for(int i =0; i < N; i++) {
              int p = findPolicePosition(policeGrid,i,N,-1);
            if ( K >= N) {
                for(int j = 0; j < N ; j++) {
                  if( p != - 1 && grid[i][j] == 'T' &&  Math.abs(j-p) <= N-1) 
                  {
                      count++;
                      p = findPolicePosition(policeGrid,i,N,p);
                  }
                    
                }
            } else if( K < N) {
                for(int j = 0; j  < N ; j++) {
                  if( p != - 1 && grid[i][j] == 'T' &&  Math.abs(j-p) <= K) 
                  {
                      count++;
                      p = findPolicePosition(policeGrid,i,N,p);
                  }
                    
                }
            }
        }
        return count;
    }
      private static int findPolicePosition(boolean[][] policeGrid, int row,int N,int p) {
         for(int i =p+1; i < N; i++) {
             if(policeGrid[row][i] == true)
               return i;
         }
         return -1;
    }
    
}
