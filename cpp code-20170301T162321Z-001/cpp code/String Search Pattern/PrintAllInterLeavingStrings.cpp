#include<iostream>
#include<string>
using namespace std;
void printIlsRecur(string& str1, string& str2, string& str3, int m, int n, int index)
{
    if( m==0 && n==0)
        cout << str3 <<endl;
    if( m != 0)
    {
        str3[index] = str1[0];
        string temp(str1.begin()+1,str1.end());
        printIlsRecur(temp,str2,str3,m-1,n,index+1);
    }
    if( n != 0)
    {
        str3[index] =str2[0];
        string temp(str2.begin()+1,str2.end());
        printIlsRecur(str1,temp,str3,m,n-1,index+1);
    }
}
void printIls(string& str1,string& str2,int m,int n)
{
    string str3(str1);
    str3.resize((str1.length()+str2.length()));
    printIlsRecur(str1,str2,str3,m,n,0);
}
int main()
{
    string str1("AB");
    string str2 ("CD");
    printIls(str1,str2,(str1.length()),(str2.length()));
}
