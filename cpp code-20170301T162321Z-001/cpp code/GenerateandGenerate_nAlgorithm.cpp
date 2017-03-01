#include<iostream>
#include<algorithm>
#include<vector>
#include<list>

using namespace std;

int main()
{
    vector<int> vectIntegers(10);
    generate(vectIntegers.begin(),vectIntegers.end(),::rand);
    for(int i =0; i< vectIntegers.size(); i++)
        cout<< vectIntegers[i] <<endl;
   cout<<"********************************************"<<endl;
    list<int> listIntegers(10);
    generate_n(listIntegers.begin(),5,::rand);
    for(auto itr = listIntegers.begin(); itr != listIntegers.end(); itr++)
        cout<< *itr <<endl;
}
