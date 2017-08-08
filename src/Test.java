
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
//public class Test {
//     public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        List<Integer> rowList = null;
//        
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
//        for(int i = 0; i < n; i++)
//         {  
//            int d = scan.nextInt();
//             rowList = new ArrayList<>(d);
//            for(int j =0; j < d; j++)
//                rowList.add(scan.nextInt());
//            list.add((ArrayList)rowList);
//        }
//
//        int q = scan.nextInt();
//        for(int i =0; i < q; i++) {
//            int x = scan.nextInt();
//            int y = scan.nextInt();
//         try {  rowList = list.get(x-1);
//            if(rowList != null && rowList.get(y-1) != null)
//                System.out.println(rowList.get(y-1));
//             }
//            catch(Exception e) {
//                System.out.println("ERROR!");
//            }
//        }
//    }
     /*public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int no_of_tc = scanner.nextInt();
        for(int i = 0; i < no_of_tc; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++)
                arr[j] = scanner.nextInt();
          //  if(isSolvable(m, arr, 0))
            //    System.out.println("YES");
           // else 
           //     System.out.println("NO");
            System.out.println(findPossibleJump(arr,m));
        }
        
    }
 private static boolean isSolvable(int m, int[] arr, int i) {
    if (i < 0 || arr[i] == 1) return false;
    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

    arr[i] = 1;
    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
}
    private static String findPossibleJump(int[] arr, int m) {
       
        int prevIndex = 0, position = 0;
        if( m >= arr.length) 
            return "YES";
        for(int curIndex=1; curIndex <= arr.length; ) {
            if(arr[curIndex] == 0) {
               // position++;
                prevIndex++;
                curIndex++;
            }
            else{
                if(prevIndex + m >= arr.length || prevIndex == arr.length-1)
                    return "YES";
              
                 else if(arr[prevIndex+m] == 0)
                {
                    curIndex += m;
                    prevIndex += m;
                 //   position +=m;
                }
                    else if(prevIndex != 0&& (arr[prevIndex-1] == 0)) {
                         arr[prevIndex] = 1;
                         curIndex -= 1;
                         prevIndex -= 1;
                        // position -= 1;
                    }
                 else {
                     return "NO";
                 }
                   
                    
                }
           
            }
         if( prevIndex >= arr.length-1)
                return "YES";
            else 
                return "NO";
    }
}*/
//     import java.util.*;
    public class Test {
        public static void main(String[] args) {
          /*  Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = Integer.MIN_VALUE;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.offerLast(num);
            }
            System.out.println(calUnique(deque,set,max,m));*/
            System.out.println(Math.log(0.25));
            
        }
        private static int calUnique(Deque<Integer> deque, Set<Integer> set, int max,int m) {
            while(!deque.isEmpty()) {
                int count = 0;
                Iterator<Integer> itr = deque.iterator(); 
                while(itr.hasNext()) {
                    if(count != m) {
                       set.add(itr.next());
                        count++;
                    } 
                    else if( count == m) {
                        break;
                    }     
                }
                if(set.size() == m) 
                        return max;
                    else if(set.size() > max) {
                        max = set.size();
                        //set.clear();
                    }
                    else {
                        //set.clear();
                 }
                deque.pollFirst();
                set.clear();
                 itr = null;
                
            }
            return max;
            
        }
        
        
    }

