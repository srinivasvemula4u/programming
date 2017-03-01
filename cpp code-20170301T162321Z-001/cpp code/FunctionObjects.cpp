#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
template<typename t>
struct Display
{

   bool operator()(const t obj) const
    {
        cout<<obj<<endl;
    }

};
int main()
{
    vector<int> vectInt;
    for(int i=0; i<10; i++)
        vectInt.push_back(i);
    for_each(vectInt.begin(),vectInt.end(),Display<int>());
}
