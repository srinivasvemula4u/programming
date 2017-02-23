/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
/*
 * Moore’s Voting Algorithm)
This is a two step process.
1. Get an element occurring most of the time in the array. This phase will make sure that if there is a majority element then it will return that only.
2. Check if the element obtained from above step is majority element.

1. Finding a Candidate:
The algorithm for first phase that works in O(n) is known as Moore’s Voting Algorithm. 
Basic idea of the algorithm is if we cancel out each occurrence of an element e with all the other elements that are different from e then e will exist
till end if it is a majority element.
 */
public class MajorityElementInArray {
    
    public static void majorityElement(int[] arr) {
        int candidate = findCandidate(arr);
        if(isMajor_element(arr,candidate)) {
            System.out.println("majority element in Array = "+candidate);
        } else {
            System.out.println(" No majority element present in the Array");
        }
    }

    private static int findCandidate(int[] arr) {
        int length = arr.length;
        int major_index = 0; int count = 1;
        for(int i = 1; i < length - 1; i++) {
            if( arr[major_index] == arr[i])
                count++;
            else 
                count --;
            if(count == 0) {
                major_index = i;
                count = 1;
            }
                
        }
        return arr[major_index];
    }   

    private static boolean isMajor_element(int[] arr, int candidate) {
        int count = 0;
       for(int val : arr) {
           if(val == candidate) {
               count++;
           }
           if( count >= (arr.length/2 +1))
               return true;
       }
       return false;
    }
       /* Driver program to test the above functions */
    public static void main(String[] args) 
    {
      
        int a[] = new int[]{1, 3, 3, 3, 2};
       // int size = a.length;
        majorityElement(a);
    }
}
    

