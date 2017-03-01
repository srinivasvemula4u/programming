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
void bubblesort(int a[],int n)
{
    for(int i=0;i<n;i++)
        for(int j=0; j < n-i-1; j++)
          if(a[j] > a[j+1])
            swap(a[j],a[j+1]);
}
void OptimizedBubbleSort(int a[],int n)
{
    bool swapped;
    for(int i=0;i<n;i++)
    {   swapped= false;
        for(int j=0; j<n-i-1; j++)
        {
            if(a[j] > a[j+1])
            {
               swap(a[j],a[j+1]);
               swapped = true;
            }
        }
        if(swapped == false)
            break;
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
    OptimizedBubbleSort(arr,length);
     cout << "array after sorting" << endl;
    print(arr,length);

}
