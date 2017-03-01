#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    char strBuf[11], buf[20];
    // Read up to 10 characters
    cin.get(strBuf, 11);
    cout << strBuf << endl;

    // Read up to 10 more characters
    cin.get(strBuf, 11);
    cout << strBuf << endl;
    cin >> setw(10) >> buf;
    cout << buf <<endl;
    return 0;
}
