#include<iostream>
using namespace std;

int i=1;

int main()
{
    int i=5;
    {
        int i =10;
        {
            int i= 20;
            cout << i <<endl<<::i<<endl;
        }
         cout << i <<endl<<::i<<endl;
    }
    cout << i <<endl<<::i<<endl;
}

