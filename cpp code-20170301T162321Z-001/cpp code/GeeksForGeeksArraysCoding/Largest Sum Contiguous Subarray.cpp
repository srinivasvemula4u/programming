/*
Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far
*/
#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int maxSubArraySum(int a[], int n)
{
    int Max_sofar=0, Max_ended=0;
    for(int i=0; i < n; i++) {
        Max_ended += a[i];
    if( Max_ended < 0)
        Max_ended = 0;
    else if(Max_sofar < Max_ended)
        Max_sofar = Max_ended;}
   return Max_sofar;
}

    /*Driver program to test maxSubArraySum*/
int main()
{
   //int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
   int a[] = {-2, -3, -4, -1, -2, -1, -5, -3};
   int n = sizeof(a)/sizeof(a[0]);
   int max_sum = maxSubArraySum(a, n);
   cout << "Maximum Sum = "<< max_sum << endl;
   return 0;
}
