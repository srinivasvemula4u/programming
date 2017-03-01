/*
METHOD 1(Use sum formula)
Algorithm:

1. Get the sum of numbers
       total = n*(n+1)/2
2  Subtract all the numbers from sum and
   you will get the missing number.


METHOD 1(Use sum formula)
Algorithm:

1. Get the sum of numbers
       total = n*(n+1)/2
2  Subtract all the numbers from sum and
   you will get the missing number.
*/

#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;
// Finding Missing Number using method1
int FindMissingNumberMethod1(int a[],int n)
{
    int FormulaSum =0,Sum = 0;
    FormulaSum = ((n+1)*(n+2))/2;
    for(int i= 0; i<n; i++)
        Sum += a[i];
    return (FormulaSum - Sum);
}
// Finding Missing Number using method2 using XOR
int FindMissingNumberMethod2(int a[], int n)
{
   int xor1 = 0, xor2 = 0;
   for(int i = 1; i <= n+1; i++)
        xor1 ^= i;
   for(int i=0 ; i < n; i++)
        xor2 ^= a[i];
   return (xor1 ^ xor2);
}
int main()
{
     int a[] = {1,2,4,5,6};
    //int miss = FindMissingNumberMethod1(a,5);
     int miss = FindMissingNumberMethod2(a,5);
    cout << "Missing Number in array =" << miss << endl;
    //getchar();
}

