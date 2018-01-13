/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;
import java.util.*;

/**
 *
 * @author srivemul
 */
/*
iven a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


American keyboard


Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabe
 */
public class KeyBoardRow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public String[] findWords(String[] words) {
         String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
         Map<Character,Integer> map = new HashMap<>();
         for(int i=0; i < strs.length; i++) {
             for(char c :strs[i].toCharArray()) {
                 map.put(c,i);
             }
         }
         List<String> list = new ArrayList<>();
         for(String str : words) {
              if(str.equals("")) continue;
               int index = map.get(str.toUpperCase().charAt(0));
                for(char c: str.toUpperCase().toCharArray()){
                if(map.get(c)!=index){
                    index = -1; //don't need a boolean flag. 
                    break;
                }
            }
             if(index!=-1) list.add(str);//if index != -1, this is a valid string
         }
         return list.toArray(new String[0]);
    }

}
