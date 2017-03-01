#include<iostream>
#include<string>

using namespace std;

void Search(string str, string pattern)
{
    int M = str.length(); //string length
    int N = pattern.length(); // pattern length
    for(int i=0; i<(M-N);i++)
    {
       int j ;
       for(j=0;j<N; j++)
        if(str[i+j] != str[j])
            break;

    if( j == N)
    {
        cout << "pattern found at index=" <<i <<endl;
    }
    }
}
int main()
{
    string txt("AABAACAADAABAAABAA");
    string pattern("AABA");
    Search(txt,pattern);
}
