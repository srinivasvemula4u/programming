#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

template<typename T>
struct DisplayElementKeepCount
{
    int mcount;
    DisplayElementKeepCount():mcount(0) {}
    void operator() (const T& obj)
    {
        ++mcount;
        cout << obj <<endl;
    }
};
int main()
{
    vector<int> intVector;
    for(int i =0; i<10; i++)
        intVector.push_back(i);
    DisplayElementKeepCount<int> functor = for_each(intVector.begin(),intVector.end(),DisplayElementKeepCount<int>());
    cout<< "Count ="<<functor.mcount<<endl;
}
