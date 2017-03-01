#include<iostream>
#include<string>
#include<vector>
#define NO_OF_CHARS 256
using namespace std;
/*
Algorithm: Let input string be “geeksforgeeks”
1: Construct character count array from the input string.

count[‘e’] = 4
count[‘g’] = 2
count[‘k’] = 2
……

2: Print all the indexes from the constructed array which have value greater than 0.
*/
void fillCharCounts(string str, vector<int>& vect)
{
    string::iterator itr = str.begin();
    while(itr != str.end())
    {
        vect[static_cast<int>(*itr)]++;
        itr++;
    }
}
/* Print duplicates present in the passed string */
void printDups(string str)
{
    vector<int> vect(NO_OF_CHARS,0);
    fillCharCounts(str,vect);
    vector<int>::iterator itr = vect.begin();
    int i=0;
    while(itr != vect.end())
    {
        if( *itr > 1)
            cout << static_cast<char>(i) << "  count ="<< (*itr) << endl;
      itr++;
      i++;
    }
}
int main()
{
    printDups("geeksforgeeks");
}
