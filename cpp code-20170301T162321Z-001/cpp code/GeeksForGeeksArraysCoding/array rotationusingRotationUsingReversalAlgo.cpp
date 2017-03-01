/*
Method 4(The Reversal Algorithm)
Please read this for first three methods of array rotation.

Algorithm:

rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], l, n);
Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is:
Reverse A to get ArB. // Ar is reverse of A
Reverse B to get ArBr. // Br is reverse of B
Reverse all to get (ArBr) r = BA.

For arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]
Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
*/
#include<iostream>
#include<conio.h>
#include<stdio.h>

using namespace std;

void printArray(int *a, int n)
{
    for(int i=0; i < n;i++)
        cout << *(a+i) << "  ";
    cout << endl;
}
void ReverseArray(int *a,int first, int last)
{
    int temp;
    while(first < last)
    {
        temp = *(a+last);
        *(a+last) = *(a+first);
        *(a+first) = temp;
        first++;
        last--;
    }
}
void RotateArrayUsingReverseAlgo(int *a, int n, int d)
{
    ReverseArray(a,0,d-1);
    ReverseArray(a,d,n-1);
    ReverseArray(a,0,n-1);
}
int main()
{
   int arr[] = {1, 2, 3, 4, 5, 6, 7};
   RotateArrayUsingReverseAlgo(arr, 7, 2);
   printArray(arr, 7);
   //getchar();
   return 0;
}
