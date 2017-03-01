#include<iostream>
#include<string>
#define NO_OF_CHARS 256
/*Algorithm:

Input string = “test”
1: Construct character count array from the input string.
  count['e'] = 1
  count['s'] = 1
  count['t'] = 2

2: Return the index of maximum value in count array (returns ‘t’).
*/
using namespace std;
int *getCharCountArray(string);
int getIndexOfMax(int *, int);

int getMaxOccuringChar(string str)
{
  int *count = getCharCountArray(str);
  return getIndexOfMax(count, NO_OF_CHARS);
}
int *getCharCountArray(string str)
{
    int *count = new int[NO_OF_CHARS]();
    string::iterator itr = str.begin();
    while(itr !=str.end())
    {
       // cout<< *itr;
        count[(*itr)]++;
        itr++;
    }

    return count;
}
int getIndexOfMax(int *count,int length)
{
     int Max_size =0;
    for(int i=0; i<length; i++)
    {
        if(count[i] > count[Max_size])
            Max_size = i;
    }
    return Max_size;
}
int main()
{
    cout<<static_cast<char>(getMaxOccuringChar("test sample"));
}
