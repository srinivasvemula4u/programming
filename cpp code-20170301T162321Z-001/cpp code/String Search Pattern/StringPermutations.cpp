#include<iostream>
#include<string>

using namespace std;

void swaping(char &c1, char &c2)
{
    char temp = c1;
    c1 = c2;
    c2 = temp;
}
void permutation(string str, int start,int endL)
{
    if( start == endL)
        cout << str <<endl;
    else
        for( int j=start; j <= endL; j++)
    {
        swaping( str[start],str[j]);
        permutation(str, start+1,endL);
        swaping( str[start],str[j]);
    }
}
int main()
{
    permutation("ABC",0,3);
}
