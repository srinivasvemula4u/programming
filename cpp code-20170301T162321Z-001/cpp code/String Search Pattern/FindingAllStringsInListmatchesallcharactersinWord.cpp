#include<iostream>
#include<string>
#include<vector>
#include<list>
#define No_Of_Character 256
using namespace std;
void buildHash(string str,vector<int>& intHash)
{
    string::iterator itr = str.begin();
    while( itr != str.end())
    {
        intHash[static_cast<int>(*itr)] = 1;
        itr++;
    }
}
void stringsInListMatchesWithWord(list<string>& strList,string word)
{
    int length = word.length();
    int  listsize = strList.size();
    vector<int> intHash(No_Of_Character,0);
    buildHash(word,intHash);
    list<string>::iterator itr = strList.begin();
    while( itr != strList.end())
    {   int matched_count =0;
        string str(static_cast<string>(*itr));
        for(int i =0; i<str.length(); i++)
        {
           if(intHash[static_cast<int>(str[i])] == 1)
           {
               matched_count++;
               intHash[static_cast<int>(str[i])] = 0; // Resetting
           }
        }
        if( matched_count == length)
        {
            cout << "String has the given word's all characters "<<*itr <<endl;
        }
        itr++;
        buildHash(word,intHash);
    }
    //cout << "length =" << length<<endl;
   //  cout << "size =" << listsize <<endl;
}
int main()
{
  string word("sun");
  list<string> strList;
  strList.push_back("geeksforgeeks");
  strList.push_back("unsorted");
  strList.push_back("sunday");
  strList.push_back("just");
  strList.push_back("sss");
  strList.push_back("nus");
  stringsInListMatchesWithWord(strList,word);
  //print(list, str, 5);
  //getchar();
  return 0;
}
