/*
Recursive Way:
1) Initialize start and end indexes
start = 0, end = n-1
2) Swap arr[start] with arr[end]
3) Recursively call reverse for rest of the array.
*/
#include<iostream>
#include<stdio.h>

using namespace std;

void ReverseArray(int *a, int first, int last)
{
    if(first >= last)
        return;
    int temp = *(a+first);
    *(a+first) = *(a+last);
    *(a+last) = temp;
    ReverseArray(a,first+1, last-1);
}
/* Utility that prints out an array on a line */
void printArray(int arr[], int size)
{
  int i;
  for (i=0; i < size; i++)
    printf("%d ", arr[i]);

  printf("\n");
}

    /* Driver function to test above functions */
int main()
{
  int arr[] = {1, 2, 3, 4, 5};
  printArray(arr, 5);
  ReverseArray(arr, 0, 4);
  printf("Reversed array is \n");
  printArray(arr, 5);
  getchar();
  return 0;
}
