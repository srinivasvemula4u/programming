#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    vector<int> vectIntegers;
    for(int i = 1; i< 100; i++)
        vectIntegers.push_back(i);
    int Divisor = 2;
    cout << "Enter Divisor value "<<endl;
    cin >> Divisor;
         //vector<int>::iterator itr = find_if(vectIntegers.begin(),vectIntegers.end(),[Divisor](int & obj) { return (obj%Divisor == 0);});
         //Basic one
        //vector<int>::iterator itr = find_if(vectIntegers.begin(),vectIntegers.end(),[Divisor](int & obj) {Divisor = 5; return (obj%Divisor == 0);});
        // we can not change the value since Divisor is read only
        //vector<int>::iterator itr = find_if(vectIntegers.begin(),vectIntegers.end(),[Divisor](int & obj)mutable {Divisor = 5; return (obj%Divisor == 0);});
        // Change doesnt effect on outside of lamda expression In this example inside lamda divisor= 5 outside still it is = 4
    vector<int>::iterator itr = find_if(vectIntegers.begin(),vectIntegers.end(),[&Divisor](int & obj)mutable {Divisor = 5; return (obj%Divisor == 0);});
    // Divisor gets effects outside of lamda expression.In this case divisor inside and outside lamda = 5
    if(itr != vectIntegers.end())
        cout << "Number divisible by " << Divisor << " is " << *itr;
}
