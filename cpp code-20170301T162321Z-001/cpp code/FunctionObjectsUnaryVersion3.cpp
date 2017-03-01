#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

template<typename T>
struct IsMultiple
{
 T Divisor;
 IsMultiple(const T &divisor)
 {
     Divisor = divisor;
 }
 bool operator() (const T &element) const
 {
     // Check if the divisor is a multiple of the divisor
     return ((element % Divisor) == 0);
 }
};

int main()
{
    vector<int> vectInt;
    for(int i = 25; i < 32; i++)
        vectInt.push_back(i);
    cout << endl << "Enter divisor (> 0): ";
    int Divisor = 2;
    cin >> Divisor;
    vector<int> :: iterator itr = find_if(vectInt.begin(),vectInt.end(),IsMultiple<int>(Divisor));
    if( (itr) !=  vectInt.end())
        cout << "First Element found by  " << Divisor << "is " <<*itr <<endl;
    else
        cout << "Element is not found"<<endl;
}
