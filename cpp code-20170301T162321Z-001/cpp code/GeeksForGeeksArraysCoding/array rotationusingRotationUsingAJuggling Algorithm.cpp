/*
This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

Here is an example for n =12 and d = 3. GCD is 3 and

Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

a)	Elements are first moved in first set – (See below diagram for this movement)

ArrayRotation

          arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}

b)	Then in second set.
          arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}

c)	Finally in third set.
          arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}
          */
#include<iostream>
#include<stdio.h>
#include<conio.h>

using namespace std;
void printArray(int *a, int n)
{
    for(int i=0; i < n;i++)
        cout << *(a+i) << "  ";
    cout << endl;
}
int GCD(int a, int b)
{
    if(b == 0)
        return a;
    return GCD(b,a%b);
}
void RotationOfArrayUsingJugglingAlgo(int *a, int n,int d)
{
    int i,j,k,temp;
    for(i=0; i<GCD(d,n); i++)
    {
        temp = a[i];
        j = i;
        while(1)
        {
            k = j+d;
            if(k >= n)
                k = k - n;
            if(k == i)
                break;
            a[j] = a[k];
      j = k;
        }
        a[j] = temp;
    }
}
int main()
{
int arr[] = {1, 2, 3, 4, 5, 6, 7};
   RotationOfArrayUsingJugglingAlgo(arr, 7, 2);
   printArray(arr, 7);
  // getchar();
   return 0;
}
