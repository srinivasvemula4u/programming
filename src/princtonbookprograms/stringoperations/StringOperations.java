/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.stringoperations;

import edu.princeton.cs.algs4.StdIn;

/**
 *
 * @author srivemul
 */
public class StringOperations {
    public static boolean isPalindrome(String str)
    {
     int length = str.length();
     for(int i =0; i < length/2; i++)
         if(str.charAt(i) != str.charAt(length-1-i))
         {
             return false;
         }
        return true;
    }
    public static void extractFileNameAndExtension(String str)
    {
        int rank = str.indexOf(".");
        String fileName = str.substring(0,rank);
        String extension = str.substring(rank+1, str.length());
        System.out.println("FileName ="+fileName);
        System.out.println("Extension ="+extension);
    }
    public static void printStringsInQueryFormInput(String query)
    {
        while(!StdIn.isEmpty())
        {
            String str = StdIn.readLine();
            if(str.contains(query))
            {
                System.out.println(str);
            }
        }
    }
    public static void splitStringFromInput(String str)
    {
        String[] words = str.split("\\s+");
        for(String s : words)
        {
            System.out.println(s);
        }
    }
    public static boolean isStringSorted(String[] str)
    {
        for(int i=1; i < str.length; i++)
        {
            if(str[i-1].compareTo(str[i])> 0)
                return false;
        }
        return true;
    }
    
    public static void main(String args[])
    {
        System.out.println(isPalindrome("liril"));
        extractFileNameAndExtension("StringOperations.java");
       // printStringsInQueryFormInput("hello");
        splitStringFromInput("hello this is java program");
        String[] str = {"A","D","B","C"};
        System.out.println(isStringSorted(str));
        
    }
    
}
