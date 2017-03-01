/*
Example: Let the input string be “i like this program very much”. The function should change the string to “much very program this like i”

Algorithm:

1) Reverse the individual words, we get the below string.
     "i ekil siht margorp yrev hcum"
2) Reverse the whole string from start to end and you get the desired output.
     "much very program this like i"
*/
#include<iostream>
#include<string>
#include<algorithm>

using namespace std;

void string_reverse(string::iterator first, string::iterator last)
{
    while(first < last)
    {
        char temp = static_cast<char>((*first));
        (*first) = (*last);
        (*last) = temp;
        first++;
        last--;
    }
}
void ReverseWords(string str)
{
    string::iterator itr = str.begin();
   int tracker_begin = 0,tracker_current =0;
    while( itr != str.end()+1)
    {
        if( (*itr) == '\0')
            string_reverse(str.begin()+tracker_begin,str.begin()+tracker_current-1);
        else if( (*itr) == ' ')
        {
            if(tracker_begin != tracker_current)
            string_reverse(str.begin()+tracker_begin,str.begin()+tracker_current-1);
            tracker_begin = tracker_current+1;

        }
        itr++;
        tracker_current++;
    }
    string_reverse(str.begin(),str.end()-1);
    cout<< "Reverse of the string ---> " << str;
}
int main()
{
   ReverseWords("i like this program very much");
}
