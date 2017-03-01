#include<iostream>
#include<string>
#include<algorithm>
/*
METHOD 1 (Use Sorting)

Algorithm:

  1) Sort the elements.
  2) Now in a loop, remove duplicates by comparing the
      current character with previous character.
  3)  Remove extra characters at the end of the resultant string.

Example:

Input string:  geeksforgeeks
1) Sort the characters
   eeeefggkkosss
2) Remove duplicates
    efgkosgkkosss
3) Remove extra characters
     efgkos
Note that, this method doesn’t keep the original order of the input string.
For example, if we are to remove duplicates for geeksforgeeks and keep the order of characters same,
then output should be geksfor, but above function returns efgkos.
 We can modify this method by storing the original order. METHOD 2 keeps the order same.
*/
using namespace std;

void selectionSort(string);
string removeDupsSorted(string str);
void printString(string);
string removeDups(string str)
{
    //selectionSort(str);
    sort(str.begin(),str.end());
    printString(str);
    return removeDupsSorted(str);
}
void swap(char& a,char& b)
{
    char temp;
     temp = a;
     a = b;
     b = temp;
}
void selectionSort(string str)
{
    int len = str.length();
    for(int i=0;i<len;i++)
    {
        int best_index = i;
        for(int j= i+1; j<len;j++)
        {
            if(str[j]>str[j+1])
                best_index = j;
        }
        swap(str[best_index],str[i]);
    }
}
void printString(string str)
{
    for(int i=0; i<str.length(); i++)
        cout<<str[i];
    cout<<endl;
}
string removeDupsSorted(string str)
{
    int mIndex=1,rIndex=1;
    while(str[mIndex])
    {
        if(str[mIndex] != str[rIndex-1])
        {
            str[rIndex]=str[mIndex];
            rIndex++;
        }
        mIndex++;
    }
    str.erase(str.begin()+rIndex,str.end());
    //str[rIndex] = '\0';
    return str;
}
int main()
{
    cout<<removeDups("srinivas");
}
