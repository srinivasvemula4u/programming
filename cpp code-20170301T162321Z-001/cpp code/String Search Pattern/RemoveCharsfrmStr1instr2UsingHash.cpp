#include<iostream>
#include<string>
#include<vector>
#define No_Of_Chars 256
using namespace std;

void BuildBinaryHashofMask(string str,vector<int>& bin_Hash)
{
    string::iterator itr = str.begin();
    while((itr != str.end()) &&( bin_Hash[static_cast<int>(*itr)] != 1))
    {
        bin_Hash[static_cast<int>(*itr)] = 1;
        itr++;
    }
}
string RemoveDuplicateCharsfrmMainofMask(string main,string mask)
{
    vector<int> bin_Hash(No_Of_Chars,0);
    BuildBinaryHashofMask(mask,bin_Hash);
    string::iterator itr = main.begin();
    int index=0;
    while(itr != main.end())
    {
       if(bin_Hash[static_cast<int>(*itr)] == 0)
       {
           main[index] = static_cast<char>(*itr);
           index++;
       }
       itr++;
    }
    main.erase(main.begin()+index,main.end());
  return main;
}
int main()
{
    cout<<RemoveDuplicateCharsfrmMainofMask("geeksforgeeks","mask") <<endl;
}
