#include<iostream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
template<typename T>
void displayContents(const T& obj)
{
    for(auto itr = obj.begin();itr != obj.end();itr++)
    cout<<*itr<<endl;
}

bool IsEven(const int &obj)
{
    return (obj %2 == 0);
}
int main()
{
    vector<int> vecIntegers;
    for(int i=0; i<10; i++)
        vecIntegers.push_back(i);
    cout << "Contents of the vector" <<endl;
    displayContents(vecIntegers);
     vector <int> vecCopy (vecIntegers);
    partition(vecIntegers.begin(),vecIntegers.end(),IsEven);
     cout << "Contents of the vector of partition" <<endl;
    displayContents(vecIntegers);
    stable_partition(vecCopy.begin(),vecCopy.end(),IsEven);
    cout << "Contents of the vector of stable partition" <<endl;
    displayContents(vecCopy);
}
