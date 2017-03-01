/*
METHOD 2 (Rotate one by one)

leftRotate(arr[], d, n)
start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
end
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
void RotateArrayByOne(int *a, int n)
{
    int temp = a[0];
    int i;
    for(i=1;i < n; i++)
        a[i-1] = a[i];
    a[i-1] = temp;
    cout << "Array after Each Rotation " << endl;
    printArray(a,n);
}
void RotateArrayByDmoves(int *arr,int n, int d)
{
    for(int i=0; i< d; i++)
        RotateArrayByOne(arr,n);
}
/* Driver program to test above functions */
int main()
{
   int arr[] = {1, 2, 3, 4, 5, 6, 7};
   RotateArrayByDmoves(arr, 7, 7);
   cout << "After after complete Rotations " << endl;
   printArray(arr, 7);
   //getchar();
   return 0;
}
