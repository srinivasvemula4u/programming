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
/*
The problem was posed with three colours, here `0', `1' and `2'. The array is divided into four sections:

a[1..Lo-1] zeroes (red)
a[Lo..Mid-] ones (white)
a[Mid..Hi] unknown
a[Hi+1..N] twos (blue)
The unknown region is shrunk while maintaining these conditions
Lo := 1; Mid := 1; Hi := N;
while Mid <= Hi do
Invariant: a[1..Lo-1]=0 and a[Lo..Mid-1]=1 and a[Hi+1..N]=2; a[Mid..Hi] are unknown.
case a[Mid] in
0: swap a[Lo] and a[Mid]; Lo++; Mid++
1: Mid++
2: swap a[Mid] and a[Hi]; Hi--
--- Dutch National Flag Algorithm, or 3-way Partitioning 
 */
public class DutchNationalFlagProblemWithThreeColors {
  public static void dutchNationalFlagProblemWithThreeColors(int[] arr) {
      int low =0,high = arr.length-1,mid = 0,temp = Integer.MIN_VALUE;
      while(mid <= high) {
          switch(arr[mid]) {
              case 0 :
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
              case 1 : 
                  mid++;
                  break;
              case 2:
                  temp = arr[mid];
                  arr[mid] = arr[high];
                  arr[high] = temp;
                  high--;
                  break;
          }
      }
  }
    public static void print(int[] arr) {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    } 
     public static void main(String args[]) {
        int[] Arr = {0,1,1,0,1,2,1,2,0,0,0,1};
        print(Arr);
       dutchNationalFlagProblemWithThreeColors(Arr);
         print(Arr);
        

        //System.out.println(lastOccuranceOfANumberInSortedArray(Arr,0,Arr.length-1,4));
    }
}
