/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Sorting;

/**
 *
 * @author srivemul
 */
public class BubbleSortKarumanchiWay {
    
      public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSortOptimized(arr);//sorting array elements using bubble sort  

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

}

    private static void bubbleSort(int[] arr) {
        for(int pass = arr.length-1; pass >= 0; pass--) {
            for(int j=0; j <= pass-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Flag is used to avoid comparsion if array is already sorted
    private static void bubbleSortOptimized(int[] arr) {
        boolean swapped = true;
        for(int pass= arr.length-1; pass >= 0 && swapped; pass--) {
            swapped = false;
            for(int i=0; i <= pass-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            
        }
    }
}
