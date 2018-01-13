/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 */
public class FindMatchIn2DArray {
    public static boolean findMatch_wrapper(char[][] mat,char[] pat,int nRow,int nCol) {
        int patLen = pat.length;
        if(patLen > nRow*nCol)
            return false;
        int[][] usedMaskArray  = new int[nRow][nCol];
        return findMatch(mat,pat,patLen,usedMaskArray,0,0,nRow,nCol,0);
    }

    private static boolean findMatch(char[][] mat, char[] pat, int patLen, int[][] usedMaskArray, int x, int y, int nRow, int nCol, int level) {
       if(level == patLen)
           return true;
       if(nRow == x || nCol == y)
           return false;
       if(usedMaskArray[x][y] == 1)
           return false;
       if((mat[x][y] != pat[level]) &&(level == 0)) {
           if(y < nCol-1) 
               return findMatch(mat, pat, patLen, usedMaskArray, x, y+1, nRow, nCol, level);
           else if(x < nRow-1)
               return findMatch(mat, pat, patLen, usedMaskArray, x+1, 0, nRow, nCol, level);
           return false;
       }
       else if(mat[x][y] == pat[level]) {
           usedMaskArray[x][y] = 1;
           boolean res = false;
        /*   res = (x > 0 ? findMatch(mat, pat, patLen, usedMaskArray, x-1, y, nRow, nCol, level+1) : false ) ||
                  (res = x < nRow-1) ? findMatch(mat, pat, patLen, usedMaskArray, x+1, y, nRow, nCol, level+1) ||
                   (res = y > 0 ? findMatch(mat, pat, patLen, usedMaskArray, x, y-1, nRow, nCol, level+1) : false) ||
                   (res = y < nCol-1 ? findMatch(mat, pat, patLen, usedMaskArray, x, y+1, nRow, nCol, level+1) : false) ||
                   (res = (y < nCol-1 && x < nRow-1) ? findMatch(mat, pat, patLen, usedMaskArray, x+1, y+1, nRow, nCol, level+1) : false) ||
                    (res = (y > 0 && x < nRow-1) ? findMatch(mat, pat, patLen, usedMaskArray, x+1, y-1, nRow, nCol, level+1) : false) |  (res = (y > 0 && x > 0 ) ? findMatch(mat, pat, patLen, usedMaskArray, x-1, y-1, nRow, nCol, level+1) : false);
                  */
        return false;
                   
       }
       return false;
    }
}
