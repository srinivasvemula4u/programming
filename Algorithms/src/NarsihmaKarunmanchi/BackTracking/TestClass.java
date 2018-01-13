/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author srivemul
 */
/*ass Solution {
	public ArrayList<Integer> allFactors(int a) {
	    
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for(int i = 1; i <= (int)Math.sqrt(a); i++)
	    {
	        if( a%i == 0)
	        result.add(i);
	        if( i != (int)Math.sqrt(a))
	           result.add(a/i);
	    }
	    Collections.sort(result);
	    return result;
	}
}*/
//class Solution {
//	public ArrayList<Integer> sieve(int a) {
//	    
//	    if(a<2)
//	       return null;
//	    int[] primes = new int[a+1];
//	    for(int i = 0 ; i <= a; i++ )
//	      primes[i] = 1;
//	     primes[0] = 0;
//	     primes[1] = 0;
//             int num = (int)Math.sqrt(a);
//	     for(int i = 2; i <) ; i++)
//	     {
//	         if(primes[i] == 1)
//	         {
//	             for( int j=2; i*j <= a; j++)
//	               primes[i*j] = 0;
//	         }
//	     }
//	     ArrayList<Integer> result = new ArrayList<Integer>();
//	     for(int i = 0; i <= a; i++)
//	     {
//	         if(primes[i] == 1) 
//	               result.add(i);
//	     }
//	     
//	     return result;
//	}
//}
//class Solution {
//    public boolean isPower(int a) {
//        if( a == 1)
//         return true;
//         if( a == 2 || a == 3)
//         return false;
//         int sqrt = (int)Math.sqrt(a);
//         int[] counter;
//         counter = new int[sqrt+1];
//         for(int i = 0; i <= sqrt; i++)
//          counter[i] = 0;
//        // int count = 0;
//        for (int i = 2; i <= sqrt; i++)
//        {
//            if( a % i == 0)
//            {
//                
//                while( a % i == 0)
//                {
//                    a= a/i;
//                    counter[i]++;
//                }
//                 if( counter[i] > 1 &&  a == 1)
//                      return true;
//            
//            }
//        }
//        if( a > 1)
//         return false;
//        for(int i = 0; i <= sqrt; i++)
//              if( counter[i]  > 0 && (counter[i] % 2 != 0))
//              return false;
//         return true;
//        
//    }
//}
class Solution {
//	public int reverse(int a) {
//	    StringBuilder builder = new StringBuilder();
//	    Boolean ngtive = false;
//	    if( a == 0)
//	      return 0;
//            System.out.println(Integer.MAX_VALUE);
//            if( a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
//                return 0;
//	    if ( a < 0) {
//	    ngtive = true;
//            a = (-1)*a;
//            }
//	     while( a > 0)
//	     {
//	         int rem = a % 10;
//	         builder.append(Integer.toString(rem));
//	         a /= 10;
//             }
//	   // builder.reverse();
//           try {
//	   a = Integer.parseInt(builder.toString());
//           }
//           catch(Exception e)
//           {
//                a =0;
//           }
//           if(ngtive)
//               return (-1*a);
//           return a;

//}
//    public int factorial(int n) {
//        int val = 5;
//        int count = 0;
//        while (n / val > 0) {
//            count = n / val;
//            val *= val;
//        }
//        if (n > 0) {
//            return count + 1;
//        }
//        return count;
//    }
//
//    public int trailingZeroes(int n) {
//        int sum = 0;
//        while (n / 5 > 0) {
//            sum += (n / 5);
//            n /= 5;
//        }
//        return sum;
//    }
//
//    public int titleToNumber(String a) {
//
//        int n = a.length();
//        int columnNum = 0;
//        int count = 0;
//        while (n > 0) {
//            char c = a.charAt(n - 1);
//
//            columnNum += (int) Math.pow(26, count) * ((int) c - 'A' + 1);
//            count++;
//            n = n - 1;
//        }
//        return columnNum;
//
//    }
//
//    public String convertToTitle(int a) {
//        // int n = a.length();
//        StringBuilder result = new StringBuilder();
//        int columnNum = 0;
//        int count = 0;
//        char c = ' ';
//        while (a > 0) {
//            if (a <= 26) {
//                result.append((char) ('A' + a - 1));
//                break;
//            }
//            int rem = a % 26;
//            if (rem == 0) {
//                c = 'Z';
//            } else {
//                c = (char) ('A' + rem - 1);
//            }
//            result.append(c);
//            a = a / 26;
//        }
//        result.reverse();
//        return result.toString();
//    }
//
//    public int initializeFactorials(int n) {
//        int factorial = 1;
//        if (n < 1) {
//            return factorial;
//        }
//        //fact.push_back(1); // 0!= 1
//        for (int curIndex = 1; curIndex <= n; curIndex++) {
//            factorial = (factorial * curIndex) % 1000003;
//        }
//        return factorial;
//    }
//
//    int findRank(String S) {
//        int[] charCount = new int[256]; // count of characters in S. 
//        for (int i = 0; i < S.length(); i++) {
//            charCount[(int) S.charAt(i)]++;
//        }
//        int rank = 1;
//        for (int i = 0; i < S.length(); i++) {
//            //    find number of characters smaller than S[i] still left. 
//            int less = 0;
//            for (int ch = 0; ch < S.charAt(i); ch++) {
//                less += charCount[ch];
//            }
//            rank = (rank + (initializeFactorials(S.length() - i - 1)) * less) % 1000003;
//            // remove the current character from the set. 
//            charCount[S.charAt(i)]--;
//        }
//        return rank;
//    }
//    
//    public int inverseNumber(int n)
//    {
//        int  MOD = 1000003;
//        int ans = 1; 
//        int base = n;
//        int power = MOD -2;
//        while( power > 0)
//        {
//            if(power == 1)
//            {
//                return (ans * base) % MOD;
//            }
//            else if( power % 2 == 0)
//            {
//                base = (base * base)% MOD;
//                power /= 2;
//            }
//            else 
//            {
//                ans = (ans*base) % MOD;
//                power --;
//            }
//            
//        }
//        return ans;
//        
//    }
//    	
//	    
//	 public void arrange(ArrayList<Integer> A) {
//	   	    int n = A.size();
//	    for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
//	    for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
//	}
//}
//
//public class TestClass {
//
//    public static void main(String args[]) {
//        Solution obj = new Solution();
//        // ArrayList<Integer> result= obj.isPower(1024000000);
//        //int val = obj.factorial(9247);
//        // System.out.println(obj.trailingZeroes(30));
////      ArrayList<Integer> a = new ArrayList<>();
////      a.add(2);
////      a.add(1);
////      a.add(3);
////      a.add(0);
////     obj.arrange(a);
////     i
//
//System.out.println(obj.inverseNumber(10));

//           for(int a : result)
//           {
//               System.out.print(" "+a);
//           }
   // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Tc = scan.nextInt();
        int[] arr;
        for(int i=0; i < Tc; i++) {
        int N = scan.nextInt();
            arr = new int[N];
            for(int j=0; j < N; i++) {
                arr[j] = scan.nextInt();
            }
           System.out.println(findAnElementInArray(arr) ? "Yes" : "No");
        }
        
    }
    private static boolean findAnElementInArray(int[] arr) {
        int max = arr.length-2;
        for(int i=1; i <=max; i++) {
            int index = getIndex(arr,i,max);
            if(index > 0)
                return true;
        }
        return false;
    }
    private static int getIndex(int[] arr,int startindex,int endIndex)
    {
        long leftArraySum = 0, rightArraySum = 0;
       //int i,j;
        for(int i=0; i < startindex; i++) 
            leftArraySum += arr[i];
        for(int i=startindex+1; i <= endIndex; i++)
            rightArraySum += arr[i];
        if(leftArraySum == rightArraySum)
            return startindex;
         return -1;   
    }
}
