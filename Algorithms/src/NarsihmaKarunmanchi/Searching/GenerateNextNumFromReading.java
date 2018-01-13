/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

/**
 *
 * @author srivemul
 */
public class GenerateNextNumFromReading {
    public static String generateNextNumFromReading(int n) {
        StringBuilder str = new StringBuilder("1");
        while( n-- > 1) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for(int i = 1; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(i-1))
                    count++;
                else 
                {
                    temp.append(count);
                    temp.append(str.charAt(i-1));
                    count = 1;
                }
                
            }
            temp.append(count);
            temp.append(str.charAt(str.length()-1));
            str = temp;
        }
        return str.toString();
    }
    public static void main(String args[]) {
        //int[] Arr = {1, 2, 3, 4, 4, 4, 4};
       // findNumberOfOccurancesOfNumberInSortedArray(Arr,);
        
        System.out.println(generateNextNumFromReading(6));
    }
}
