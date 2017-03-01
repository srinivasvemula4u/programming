
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
template<typename T>
bool Isbool(const T& obj)
{
    return ( obj % 2 == 0);
}
int main()
{
    vector<int> vectIntegers;

    for(int i= -9; i< 10; i++)
        vectIntegers.push_back(i);
    int numtoFind = 0;
    cout << "Enter number to find" <<endl;
    cin >> numtoFind;
    auto itr = find(vectIntegers.begin(),vectIntegers.end(),numtoFind);
    if(itr != vectIntegers.end())
        cout<< "Number found at " << *itr <<endl ;
    itr = find_if(vectIntegers.begin(), vectIntegers.end(),[numtoFind](int& num)-> bool { return (numtoFind == num);});
    if(itr != vectIntegers.end())
        cout<< "Number found at " << distance(vectIntegers.begin(),itr) <<endl ;
        itr = find_if(vectIntegers.begin(),vectIntegers.end(),Isbool<int>);
         cout<< "Number found at " << distance(vectIntegers.begin(),itr) <<endl ;


}
