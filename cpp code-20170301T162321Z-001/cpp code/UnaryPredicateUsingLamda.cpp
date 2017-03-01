#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    vector<int> vectIntegers;
    vectIntegers.push_back(21);
    vectIntegers.push_back(16);
    vectIntegers.push_back(10);
    vectIntegers.push_back(-13);
    vector<int>::iterator itr = find_if(vectIntegers.begin(),vectIntegers.end(),[](int &obj){ return (obj%2 == 0);});
    if(itr != vectIntegers.end())
        cout << "Even number in the list="<<(*itr)<<endl;
}
