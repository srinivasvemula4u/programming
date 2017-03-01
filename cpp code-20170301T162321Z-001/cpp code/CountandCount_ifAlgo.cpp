
#include<iostream>
#include<string>
#include<algorithm>

using namespace std;

template<typename T>
int IsEven(const T& obj)
{
    return (obj % 2 == 0);
}
int main()
{
    vector<int> vectIntegers;
    for (int nNum = -9; nNum < 10; ++ nNum)
        vectIntegers.push_back(nNum);
    for(int i =0; i< vectIntegers.size(); i++)
        cout << vectIntegers[i] << endl;
    //vectIntegers.push_back(0);
    size_t  num = count(vectIntegers.begin(), vectIntegers.end(),0);
    cout<< "Number of repeated numbers ="<<num<<endl;
    num = count_if(vectIntegers.begin(),vectIntegers.end(),[](int& obj){ return (obj % 2 == 0);});
    cout<< "Number of Even numbers ="<<num<<endl;
     num = count_if(vectIntegers.begin(),vectIntegers.end(),IsEven<int>);
    cout<< "Number of Even numbers ="<<num<<endl;
}
