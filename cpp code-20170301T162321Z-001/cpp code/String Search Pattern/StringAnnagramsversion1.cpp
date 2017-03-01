#include<iostream>
#include<string>
#include<algorithm>
/*
Method 1 (Use Sorting)
1) Sort both strings
2) Compare the sorted strings
*/
using namespace std;
bool areAnagram(string& str1, string& str2)
{
    int len1 = str1.length();
    cout << len1 <<endl;
    int len2 = str2.length();
    cout << len2 <<endl;
    if( len1 != len2)
            return false;
    sort(str1.begin(),str1.end());
    sort(str2.begin(),str2.end());
    for( int i=0; i < len1; i++)
    {
        if( str1[i] != str2[i] )
                return false;
    }
    return true;
}
int main()
{
    string str1("test");
    string str2("sett");
    if(areAnagram(str1,str2))
        cout << "Strings are anagrams to each other" << endl;
    else
        cout << "Strings are not anagrams to each other" << endl;
}

