/*
Question: We have discussed Naive String matching algorithm here. Consider a situation where all characters of pattern
are different. Can we modify the original Naive String Matching algorithm so that it works better for these types of patterns.
If we can, then what are the changes to original algorithm?

Solution: In the original Naive String matching algorithm ,
we always slide the pattern by 1. When all characters of pattern are different, we can slide the pattern by more than 1.
Let us see how can we do this. When a mismatch occurs after j matches,
we know that the first character of pattern will not match the j matched characters because all characters of pattern are different.
 So we can always slide the pattern by j without missing any valid shifts. Following is the modified code that is
 optimized for the special patterns.
*/
#include<iostream>
#include<string>

using namespace std;
void Search(string text, string pattern)
{
    int text_length = text.length();
    int pattern_length = pattern.length();
    int text_index =0;
    int pattern_index;
    while( text_index < (text_length - pattern_length))
    {
        for( pattern_index =0; pattern_index< pattern_length ; pattern_index++)
        {
            if(text[text_index+pattern_index] != pattern[pattern_index])
                break;
        }
        if( pattern_index == pattern_length)
        {
            cout << " Pattern found at index = "<< text_index <<endl;
            text_index = text_index + pattern_length;
        }
        if( pattern_index == 0)
        {
            text_index += 1;
        }
        else if(pattern_index != 0)
        {
            text_index = text_index + pattern_index;
        }

    }
}
int main()
{
    string txt("AABABCABDAABCAABAA");
    string pattern("ABC");
    Search(txt,pattern);
}
