#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int main()
{
    vector<int> vectMultiplicand, vectMultiplier;
    for(int i = 0; i< 10; i++)
            vectMultiplicand.push_back(i);
    for(int i = 100; i< 110; i++)
            vectMultiplier.push_back(i);
    vector<int> Result;
    Result.resize(vectMultiplicand.size());
    transform(vectMultiplicand.begin(),vectMultiplicand.end(),vectMultiplier.begin(),Result.begin(),
              [](int &a,int &b){return (a*b);});
    cout << "Multiplier details are";
    for(int i=0; i<vectMultiplier.size();i++)
        cout<< vectMultiplier[i] << " ";
    cout <<endl;
     cout<< "Multiplicand details are" ;
    for(int i=0; i< vectMultiplicand.size(); i++)
       cout<< vectMultiplicand[i] << " ";
    cout<<endl << endl;
    cout<< "Result details are";
    for(int i=0; i<Result.size(); i++)
         cout<< Result[i] << " ";
    cout << endl;
}
