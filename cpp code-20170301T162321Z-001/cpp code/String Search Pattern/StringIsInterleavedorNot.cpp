#include<iostream>
#include<string>

using namespace std;
bool isInterleaved(string& str1, string& str2, string& str3)
{
        char *A = const_cast<char *>(str1.c_str());
        char *B = const_cast<char *>(str2.c_str());
        char *C = const_cast<char *>(str3.c_str());
        while( *C != 0)
        {
            if( *A == *C)
                A++;
            else if( *B == *C)
                B++;
            else
                return false;
         C++;
        }
      // than sum of lengths of A and B, so return false
            if (*A || *B)
                    return false;

        return true;

}
int main()
{
    string str1("AB");
    string str2("CD");
    string str3("ACBD");
    if (isInterleaved(str1,str2,str3) == true)
    cout << str3 <<" is interleaved of " << str1 <<" and "<< str2 <<endl;
    else
    cout << str3 <<" is not interleaved of " << str1 <<" and "<< str2 <<endl;
}
