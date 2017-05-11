/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srivemul
 */
/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
/*
Solution Hint : 

two loops, one go through the row, one go through the column

database: pretty straight forward, ArrayList

calculate element value: K(i)(j)=K(i-1)(j-1)+K(i-1)(j) except for the first and last element
*/
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> triangle = new ArrayList<>();
       if(numRows <=0)
         return triangle;
       for(int i =0; i < numRows; i++) {
           List<Integer> row = new ArrayList<>();
           for(int j =0; j <=i; j++) {
               if( j ==0 || j == i) {
                   row.add(1);
               }
               else {
                   row.add(triangle.get(i-1).get(j-1)+ triangle.get(i-1).get(j));
               }
           }
           triangle.add(row);
       }
       return triangle;
    }
}
