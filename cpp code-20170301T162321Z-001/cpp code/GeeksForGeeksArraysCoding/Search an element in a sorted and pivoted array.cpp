/*8
Find the pivot point, divide the array in two sub-arrays and call binary search.
The main idea for finding pivot is – for a sorted (in increasing order) and pivoted array, pivot element is the only only element for which next element to it is smaller than it.
Using above criteria and binary search methodology we can get pivot element in O(logn) time

Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) //Index of 5
  2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
*/
#include<iostream>
#include<cstdio>
using namespace std;
int FindPivot(int a[],int n,int low, int high)
{
    if( high < low ) return -1;
    if( low == high) return low;
    int mid = (low+high)/2;
    if(mid < high && a[mid] > a[mid+1])
        return mid;
    else if(mid > low && a[mid] < a[mid-1])
        return mid-1;
    if( a[low] >= a[mid])
       return FindPivot(a,n,0,mid-1);
    else
        return FindPivot(a,n,mid+1,high);
}
int BinarySearch(int a[],int low,int high,int num)
{
    if (high < low)
       return -1;
    int mid = (low+high)/2;
    if(a[mid] == num)
        return mid;
    else if(a[mid] > num)
        return BinarySearch(a,mid+1,high,num);
    else if(a[mid] < num)
        return BinarySearch(a,low,mid-1,num);
}
int pivotedBinarySearch(int arr[], int arr_size, int no)
{
   int pivot = FindPivot(arr, arr_size-1,0, arr_size-1);

   // If we didn't find a pivot, then array is not rotated at all
   if (pivot == -1)
     return BinarySearch(arr, 0, arr_size-1, no);

   // If we found a pivot, then first compare with pivot and then
   // search in two subarrays around pivot
   if (arr[pivot] == no)
     return pivot;
   if (arr[0] <= no)
     return BinarySearch(arr, 0, pivot-1, no);
   else
     return BinarySearch(arr, pivot+1, arr_size-1, no);
}
/* Driver program to check above functions */
int main()
{
   // Let us search 3 in below array
   int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
   int arr_size = sizeof(arr1)/sizeof(arr1[0]);
   int no = 3;
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr1, arr_size, no));

    // Let us search 3 in below array
   int arr2[] = {3, 4, 5, 1, 2};
   arr_size = sizeof(arr2)/sizeof(arr2[0]);
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr2, arr_size, no));

   // Let us search for 4 in above array
   no = 4;
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr2, arr_size, no));

   // Let us search 0 in below array
   int arr3[] = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1};
   no = 0;
   arr_size = sizeof(arr3)/sizeof(arr3[0]);
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr3, arr_size, no));

   // Let us search 3 in below array
   int arr4[] = {2, 3, 0, 2, 2, 2, 2, 2, 2, 2};
   no = 3;
   arr_size = sizeof(arr4)/sizeof(arr4[0]);
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr4, arr_size, no));

   // Let us search 2 in above array
   no = 2;
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr4, arr_size, no));

   // Let us search 3 in below array
   int arr5[] = {1, 2, 3, 4};
   no = 3;
   arr_size = sizeof(arr5)/sizeof(arr5[0]);
   printf("Index of the element is %d\n",  pivotedBinarySearch(arr5, arr_size, no));

   return 0;
}

