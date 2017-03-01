#include<iostream>
#include<string>
using namespace std;
void reverse(string str)
{
    string::iterator itr = str.begin();
    if( itr != str.end())
    {
     reverse(string(str.begin()+1,str.end()));
     cout<< *itr;

    }
}
int main()
{
    reverse("harish");
}
