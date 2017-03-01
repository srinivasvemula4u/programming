#include<iostream>
#include<string>
#include<vector>
#include<climits>
#define No_Of_Character 256
using namespace std;
struct HashMap
{
    int index;
    int char_count;
};
void BuildHashMapForString( string& str, vector<HashMap>& vectHashMap)
{
   string::iterator itr = str.begin();
   int tracker = 0;
   while(itr != str.end())
   {
       vectHashMap[static_cast<int>(*itr)].char_count = vectHashMap[static_cast<int>(*itr)].char_count+1;
       if(vectHashMap[static_cast<int>(*itr)].char_count == 1)
       {
           vectHashMap[static_cast<int>(*itr)].index = tracker;
       }
      tracker++;
      itr++;
   }
}
void  firstNonRepeating(string str)
{
    vector<HashMap> vectHashMap(No_Of_Character);
    BuildHashMapForString(str,vectHashMap);
    int min_Index = INT_MAX;
    int result = 0;
    for( int i= 0; i < No_Of_Character; i++)
    {
        if((vectHashMap[i].char_count == 1) && (min_Index > vectHashMap[i].index))
        {
            result = i;
            min_Index = vectHashMap[i].index;
        }
    }
    if( (result > 0) && (min_Index != INT_MAX))
        cout << "First Non repeating character in the given string = "<<static_cast<char>(result) <<endl;
    else
        cout << "Given string does not have non repeating characters" <<endl;
}
int main()
{
    firstNonRepeating("geeksforgeeks");
}
