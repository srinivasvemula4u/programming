#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

template<typename T>
struct DisplayObjectCount
{
  //  static int mcount;
  int mcount;
    DisplayObjectCount()
    {
         cout << "Constructor" << endl;
         mcount = 0;
    }
    bool operator()(const T obj)
    {
        ++mcount;
        cout<< obj << endl;
    }
};
//template<typename T>
//int DisplayObjectCount<T> :: mcount = 0;
int main()
{
    vector<int> vectInt;
    DisplayObjectCount<int> Result;
    for(int i =0; i< 10; i++)
        vectInt.push_back(i);
    Result = for_each(vectInt.begin(),vectInt.end(),DisplayObjectCount<int>());
    cout<< "Count = "<<Result.mcount<<endl;
   // for_each(vectInt.begin(),vectInt.end(),Result());

}
