#include<iostream>
#include<string>
#include<vector>
#define NO_OF_CHARACTERS 256
/*
Method 2 (Count characters)
This method assumes that the set of possible characters in both strings is small. In the following
implementation, it is assumed that the characters are stored using 8 bit and there can be 256 possible
characters.
1) Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
2) Iterate through every character of both strings and increment the count of character in the
corresponding count arrays.
3) Compare count arrays. If both count arrays are same, then return true.
*/
using namespace std;
bool areAnagram(string& str1, string& str2)
{
    vector<int> vectIntForStr1(NO_OF_CHARACTERS,0);
    vector<int> vectIntForStr2(NO_OF_CHARACTERS,0);
    int length1 = str1.length();
    int length2 = str2.length();
    if(length1 != length2)
        return false;
    for(int i = 0; i < length1; i++)
    {
        vectIntForStr1[static_cast<int>(str1[i])]++;
        vectIntForStr2[static_cast<int>(str2[i])]++;
    }
    for( int i=0; i< NO_OF_CHARACTERS; i++ )
    {
        if(vectIntForStr1[i] != vectIntForStr2[i])
            return false;
    }
    return true;
}
bool OptareAnagram(string& str1, string& str2)
{
    vector<int> vectIntForStr1Str2(NO_OF_CHARACTERS,0);
    int length1 = str1.length();
    int length2 = str2.length();
    if(length1 != length2)
        return false;
    for(int i = 0; i < length1; i++)
    {
        vectIntForStr1Str2[static_cast<int>(str1[i])]++;
        vectIntForStr1Str2[static_cast<int>(str2[i])]--;
    }
    for( int i=0; i< NO_OF_CHARACTERS; i++ )
    {
        if(vectIntForStr1Str2[i])
            return false;
    }
    return true;
}
int main()
{
    string str1("test");
    string str2("setw");
    if(OptareAnagram(str1,str2))
        cout << "Strings are anagrams to each other" << endl;
    else
        cout << "Strings are not anagrams to each other" << endl;
}
