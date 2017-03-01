/*
METHOD 1 (Use temp array)

Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]
Time complexity O(n)
Auxiliary Space: O(d)
*/
#include<iostream>
#include<stdio.h>
#include<conio.h>
#define MAX 100
using namespace std;
void printArray(int *a, int n)
{
    for(int i=0; i < n;i++)
        cout << *(a+i) << "  ";
    cout << endl;
}
void copytoTempArray(int *a,int *temp,int d)
{
    for(int i=0; i < d; i++)
    {
        *(temp+i) = *(a+i);
    }
    cout << "Temp Array with " << d << " elements " << endl;
    printArray(temp,d);
}
void MoveMainArray(int *a, int n, int d)
{
    for(int i = d, j=0; (i < n )&& (j < (n-d)); i++, j++)
        *(a+j) = *(a+i);
    cout << "Main Array with after moving elements " << endl;
    printArray(a,n);
}
void StoreBackToMainArrayFromTemp(int *a, int *temp, int n, int d)
{
    for(int i = n-d,j= 0; (j<d) && (i < n); i++, j++)
        *(a+i) = *(temp+j);
}
int main()
{
   int arr[] = {1, 2, 3, 4, 5, 6, 7};
   int temp[MAX];
   copytoTempArray(arr,temp,2);
   MoveMainArray(arr,7,2);
   StoreBackToMainArrayFromTemp(arr,temp,7,2);
   cout << "Complete Array After Rotation " << endl;
   printArray(arr,7);
   return 0;
}
