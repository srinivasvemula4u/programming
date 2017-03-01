/*
Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1 using only one call to strstr routine?
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)

Algorithm: areRotations(str1, str2)

    1. Create a temp string and store concatenation of str1 to
       str1 in temp.
                          temp = str1.str1
    2. If str2 is a substring of temp then str1 and str2 are
       rotations of each other.

    Example:
                     str1 = "ABACD"
                     str2 = "CDABA"

     temp = str1.str1 = "ABACDABACD"
     Since str2 is a substring of temp, str1 and str2 are
     rotations of each other.
*/
#include<iostream>
#include<string>
using namespace std;

int AreRotations(string main,string sub)
{
    int main_size = main.size();
    int sub_size = sub.size();
    if(main_size != sub_size)
        return 0;
    string temp(main);
    //temp.append(main);
    temp.append(main);
    size_t pos = temp.find(sub); // Finds substring
    if(pos == string::npos)
        return 0;
    else
        return 1;

}
int main()
{
    if(AreRotations("ABCD","BCDA"))
        cout << "Given two strings are rotations of each other"<<endl;
    else
       cout << "Given two strings are not rotations of each other"<<endl;
}
