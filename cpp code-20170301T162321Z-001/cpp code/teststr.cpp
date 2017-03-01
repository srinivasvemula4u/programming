#include<iostream>
#include<string>
#include<algorithm>

using namespace std;
int main()
{
    string str("hello");
    sort(str.begin(),str.end());
    cout<<str;
}
