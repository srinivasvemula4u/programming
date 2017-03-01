#include<iostream>

using namespace std;

void swap(int &x, int&y)
{
    int temp;
    temp = x;
    x= y;
    y= temp;
}
void print(int a[],int n)
{
    for(int i=0;i<n;i++)
        cout<< a[i] << " ";
    cout<<endl;
}
void insertionSort(int a[],int n)
{
    int key;
    int j;
    for( int i = 1; i<n; i++)
    {
        key = a[i];
        j=i-1;
        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while( j >=0 && a[j] > key)
        {
            a[j+1]= a[j];
            j = j-1;
        }
        a[j+1]= key;
    }
}
int main()
{
    int arr[] = {3,1,5,2,4,6};
    int length = sizeof(arr)/sizeof(int);
    cout << "length ="<<length<<endl;
    cout << "array befort sorting" << endl;
    print(arr,length);
    //bubblesort(arr,length);
   // OptimizedBubbleSort(arr,length);
   insertionSort(arr,length);
     cout << "array after sorting" << endl;
    print(arr,length);

}

