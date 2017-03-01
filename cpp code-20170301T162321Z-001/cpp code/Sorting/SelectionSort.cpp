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
void SelectionSort(int a[],int n)
{
    int best_index;
    for(int i = 0; i< n; i++)
    {
        best_index = i;
        for( int j = i+1; j< n; j++)
        {
            if(a[best_index] > a[j])
               best_index = j;
        }
        swap(a[best_index],a[i]);
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
   SelectionSort(arr,length);
     cout << "array after sorting" << endl;
    print(arr,length);

}

