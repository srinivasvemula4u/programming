#include<iostream>
#include<string>
#include<algorithm>

using namespace std;

void allLexicographicRecur(string& str, string& data, int last,int index)
{
    for( int i=0; i< str.length(); i++)
    {
        data[index] = str[i];
    if( index == last)
    {
        cout << data << endl;
    }
    else
        allLexicographicRecur(str,data,last,index+1);
    }
}
void allLexicographic(string& str)
{
  string data(str);
  sort(str.begin(),str.end());
  allLexicographicRecur(str,data,str.length()-1,0);
}
int main()
{
    string str("ABC");
    cout << "All permutations with repetition of " << str << " are:" <<endl;
    allLexicographic(str);
}
