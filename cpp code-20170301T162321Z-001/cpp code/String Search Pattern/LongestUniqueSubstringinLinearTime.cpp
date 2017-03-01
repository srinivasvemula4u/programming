/*
Method 1 (Simple)
We can consider all substrings one by one and check for each substring whether it contains all unique characters or not.
There will be n*(n+1)/2 substrings. Whether a substirng contains all unique characters or not can be checked in linear time
by scanning it from left to right and keeping a map of visited characters. Time complexity of this solution would be O(n^3).

Method 2 (Linear Time)
Let us talk about the linear time solution now. This solution uses extra space to store the last indexes of already
visited characters. The idea is to scan the string from left to right, keep track of the maximum length Non-Repeating
 Character Substring (NRCS) seen so far. Let the maximum length be max_len. When we traverse the string,
 we also keep track of length of the current NRCS using cur_len variable. For every new character,
 we look for it in already processed part of the string (A temp array called visited[] is used for this purpose).
 If it is not present, then we increase the cur_len by 1. If present, then there are two cases:

a) The previous instance of character is not part of current NRCS (The NRCS which is under process). In this case, we need to simply increase cur_len by 1.
b) If the previous instance is part of the current NRCS, then our current NRCS changes. It becomes the substring staring from the next character of previous instance to currently scanned character. We also need to compare cur_len and max_len, before changing current NRCS (or changing cur_len).
*/
#include<iostream>
#include<string>
#include<vector>
#define No_Of_chars 256

using namespace std;
int UniqueSubString(string str)
{
    vector<int> VisitedString(No_Of_chars,-1);
    int string_length = str.length();
  //  cout << string_length <<endl;
    int Prev_Index;
    int Max_SubStringLen =1, Current_SubStringLen =1;
    VisitedString[static_cast<int>(str[0])] = 0;
    for (int index = 1; index < string_length ; index++)
    {
        Prev_Index = VisitedString[str[index]];
      //  cout << "Prev_Index " << Prev_Index << " Index =" << index << "Current_SubStringLen " << Current_SubStringLen<< endl ;
        /* If the currentt character is not present in the already processed
           substring or it is not part of the current NRCS, then do cur_len++ */
        if( Prev_Index == -1 || ((index - Current_SubStringLen) > Prev_Index))
                    Current_SubStringLen ++;
            /* If the current character is present in currently considered NRCS,
           then update NRCS to start from the next character of previous instance. */
        else
        {
            if( Max_SubStringLen < Current_SubStringLen)
                    Max_SubStringLen = Current_SubStringLen;
            Current_SubStringLen = index - Prev_Index;
        }
        VisitedString[str[index]] = index;
    }
    if( Max_SubStringLen < Current_SubStringLen)
        Max_SubStringLen = Current_SubStringLen;
    return Max_SubStringLen;
}

int main()
{
    cout << " Maximum Length of Unique Substring = "<<UniqueSubString("ABDEFGABEF") <<endl;
}
