#include<iostream>
using namespace std;

int main()
{
    cout << "Enter number of integers you wish to reserve: ";
    try{
        int input =0;
        cin >> input;
        int* pReservedInts = new int [input];
        delete[] pReservedInts;
    }
    catch(bad_alloc & exp)
    {
        cout << "Exception encountered: " << exp.what() << endl;
        cout << "Exception encountered. Got to end, sorry!" <<endl;
    }
    catch(...)
    {
        cout<<"Exception encountered. Got to end, sorry!"<<endl;
    }
}
