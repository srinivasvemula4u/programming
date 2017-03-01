#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

template<typename T>
class Multiply
{
public:
        Multiply()
        {
            cout << "Constructor" <<endl;
        }
        T operator()(const T& obj1, const T& obj2)
        {
            return (obj1*obj2);
        }
};
int main()
{
    vector<int> Multiplier, Mutltiplicand;
    for (int nCount1 = 0; nCount1 < 10; ++ nCount1)
              Mutltiplicand.push_back (nCount1);
    // Insert sample values 100 to 109
    for (int nCount2 = 100; nCount2 < 110; ++ nCount2)
        Multiplier.push_back (nCount2);
    //Multiply<int> mobj();
    vector<int> Result;
    Result.resize(10);
    transform(Multiplier.begin(),Multiplier.end(),Mutltiplicand.begin(),Result.begin(),Multiply<int>());
    //transform(Multiplier.begin(),Multiplier.end(),Mutltiplicand.begin(),Result.begin(),mobj());
    cout << "The contents of the first vector are: " << endl;
    for (size_t nIndex1 = 0; nIndex1 < Mutltiplicand.size (); ++ nIndex1)
    cout << Mutltiplicand [nIndex1] << ' ';
    cout << endl;
    cout << "The contents of the second vector are: " << endl;
    for (size_t nIndex2 = 0; nIndex2 < Multiplier.size (); ++nIndex2)
    cout << Multiplier [nIndex2] << ' ';
    cout << endl << endl;

    cout << "The result of the multiplication is: " << endl;
    for (size_t nIndex = 0; nIndex < Result.size (); ++ nIndex)
    cout << Result [nIndex] << ' ';

    return 0;

}
