/*Algorithm:

Let first array be mPlusN[] and other array be N[]
1) Move m elements of mPlusN[] to end.
2) Start from nth element of mPlusN[] and 0th element of N[] and merge them
    into mPlusN[].
    */
#include<stdio.h>
#include<iostream>
#define NA -1
using namespace std;

void MovetoEnd(int *a,int arr_size)
{
    int i =0,j= arr_size-1;
    for( i = arr_size-1; i >= 0; i--)
    {
        if(*(a+i) != NA) {
            *(a+j) = *(a+i);
            j--;
        }

    }
}
/* Utility that prints out an array on a line */
void printArray(int *arr, int size)
{
  int i;
  for (i=0; i < size; i++)
    printf("%d ", *(arr+i));

  printf("\n");
}
void MergeArray(int *mPlusN, int *N,int m, int n)
{
    int i = n; // FOr mPlusN index
    int j = 0; // N index;
    int k = 0; // Output of mPlusN index
    while (k < (m+n))
    {
        /* Take an element from mPlusN[] if
       a) value of the picked element is smaller and we have
          not reached end of it
       b) We have reached end of N[] */
    if ((i < (m+n) && mPlusN[i] <= N[j]) || (j == n))
    {
      *(mPlusN+k) = *(mPlusN+i);
      k++;
      i++;
    }
    else
    {
        *(mPlusN+k) = *(N+j);
        k++;
        j++;
    }
    }
}
/* Driver function to test above functions */
int main()
{
  /* Initialize arrays */
  int mPlusN[] = {2, 8, NA, NA, NA, 13, NA, 15, 20};
  int N[] = {5, 7, 9, 25};
  int n = sizeof(N)/sizeof(N[0]);
  int m = sizeof(mPlusN)/sizeof(mPlusN[0]) - n;

  /*Move the m elements at the end of mPlusN*/
  MovetoEnd(mPlusN, m+n);

  /*Merge N[] into mPlusN[] */
  MergeArray(mPlusN, N, m, n);

  /* Print the resultant mPlusN */
  printArray(mPlusN, m+n);

  return 0;
}

