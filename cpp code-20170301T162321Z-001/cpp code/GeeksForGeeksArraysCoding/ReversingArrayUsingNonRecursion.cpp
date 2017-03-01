/*
Iterative way:
1) Initialize start and end indexes.
start = 0, end = n-1
2) In a loop, swap arr[start] with arr[end] and change start and end as follows.
start = start +1; end = end – 1
*/
/* Function to reverse arr[] from start to last*/
#include<iostream>
#include<stdio.h>

using namespace std;
void rvereseArray(int arr[], int first, int last)
{
  int temp;
  while(first < last)
  {
    temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
    first++;
    last--;
  }
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
  int arr[] = {1, 2, 3, 4, 5, 6};
  printArray(arr, 6);
  rvereseArray(arr, 0, 5);
  printf("Reversed array is \n");
  printArray(arr, 6);
  getchar();
  return 0;
}
