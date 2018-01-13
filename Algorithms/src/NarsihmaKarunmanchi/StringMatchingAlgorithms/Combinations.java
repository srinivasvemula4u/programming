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
public class Combinations {
   public static void combinationOne(String str) {
       combinationOne("",str);
   } 

    private static void combinationOne(String prefix, String str) {
      if(str.length() > 0) {
          System.out.println(prefix+str.charAt(0));
          combinationOne(prefix+str.charAt(0),str.substring(1));
          combinationOne(prefix, str.substring(1));
      }
    }
    // Alternative Method 
   public static void combinationTwo(String str) {
       combinationTwo("",str);
   }
      private static void combinationTwo(String prefix, String str) {
        
         if(prefix.length() > 0) {
              System.out.println(prefix);
         }
              for(int i =0; i < str.length(); i++)
                  combinationTwo(prefix+str.charAt(i), str.substring(i+1));
          
      }
     public static void main(String args[]) {
        String str = "abc";
        combinationTwo(str);
    }

 
}
