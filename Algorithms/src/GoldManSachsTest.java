
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class GoldManSachsTest {

    /**
     * @param args the command line arguments
     */
//    static int findDuplicates(int[][] data, int operation, int numOfDuplicates) {
//    
//        int rows = data.length;
//        int cols = data[0].length;
//        int numOfRows = 0;
//        HashMap<Integer,Integer> map = new HashMap();
//        if( 1 == operation) {
//            for(int i=0; i < rows; i++) {
//                int dupCount = 0;
//                for(int j=0; j < cols; j++) {
//                    if(map.get(data[i][j]) != null)
//                        dupCount++;
//                    else 
//                        map.put(data[i][j],data[i][j]);
//                }
//                if(dupCount >= numOfDuplicates)
//                    numOfRows++;
//                map.clear();
//            }
//            return numOfRows;
//        }
//        else if(2 == operation) {
//           int colCount = 0;int minRowCount = 0;
//           for(int i=0; i < cols; i++) {
//                int dupCount = 0;
//                for(int j=0; j < rows; j++) {
//                    if(map.get(data[j][i]) != null)
//                        dupCount++;
//                    else 
//                        map.put(data[i][j],data[i][j]);
//                }
//                
//                if(dupCount > 0) {
//                    colCount++;
//                    minRowCount = dupCount+1; 
//                }
//                map.clear();
//            }
//           if(colCount >= numOfRows)
//               return minRowCount;
//            return numOfRows;
//        }
//            return -1;
//
//    }
    static int findDuplicates(int[][] data, int operation, int numOfDuplicates) {

        int rows = data.length;
        int cols = data[0].length;
        int numOfRows = 0;
        HashMap<Integer, Integer> map = new HashMap();
        if (1 == operation) {
            for (int i = 0; i < rows; i++) {
                int dupCount = 0;
                for (int j = 0; j < cols; j++) {
                    if (map.get(data[i][j]) != null) {
                        dupCount++;
                    } else {
                        map.put(data[i][j], data[i][j]);
                    }
                }
                if (dupCount >= numOfDuplicates) {
                    numOfRows++;
                }
                map.clear();
            }
            return numOfRows;
        } else if (2 == operation) {
            int colCount = 0;
            int minRowCount = 0;
            for (int i = 0; i < cols; i++) {
                int dupCount = 0;
                for (int j = 0; j < rows; j++) {
                    if (map.get(data[j][i]) != null) {
                        dupCount++;
                    } else {
                        map.put(data[j][i], data[j][i]);
                    }
                }
                if (dupCount > 0 && dupCount >= numOfDuplicates) {
                    colCount++;
                    if (dupCount > minRowCount && dupCount >= numOfDuplicates) {
                        minRowCount = dupCount + 1;
                    }
                }
                map.clear();
            }
            numOfRows = Math.max(colCount, minRowCount);
            return numOfRows;
        }
        return -1;

    }

//    static int findDuplicates(int[][] data, int operation, int numOfDuplicates) {
//    
//        int rows = data.length;
//        int cols = data[0].length;
//        int numOfRows = 0;
//        HashMap<Integer,Integer> map = new HashMap();
//        if( 1 == operation) {
//            for(int i=0; i < rows; i++) {
//                int dupCount = 0;
//                for(int j=0; j < cols; j++) {
//                    if(map.get(data[i][j]) != null)
//                        dupCount++;
//                    else 
//                        map.put(data[i][j],data[i][j]);
//                }
//                if(dupCount >= numOfDuplicates)
//                    numOfRows++;
//                map.clear();
//            }
//            return numOfRows;
//        }
//        else if(2 == operation) {
//           int colCount = 0;int minRowCount = 0;
//           for(int i=0; i < cols; i++) {
//                int dupCount = 0;
//                for(int j=0; j < rows; j++) {
//                    if(map.get(data[j][i]) != null)
//                        dupCount++;
//                    else 
//                        map.put(data[j][i],data[j][i]);
//                }
//                
//                if(dupCount >= numOfDuplicates-1) {
//                    numOfRows++;
//                }
//                map.clear();
//            }
//            return numOfRows;
//        }
//            return -1;
//
//    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] data = {{1, 3, 5, 9}, {1, 2, 1, 2}, {1, 4, 7, 9}, {3, 5, 9, 11}};
        System.out.println(findDuplicates(data, 2, 2));

    }

}
