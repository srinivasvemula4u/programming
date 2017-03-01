#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
string FindPali(string str)
{
	int length = str.size();
	  int i =0;
	  int j = length;
	  int maxlength =0;
	  string longpali;
	  for(i= 0;(i < length); i++) {
	  for(j=0; j<length; j++)
	  {
		string sub = str.substr(i,j+1);
		string bak(sub);
		reverse(bak.begin(),bak.end());
		 if((sub == bak) && (maxlength < bak.size()))
			{
			   maxlength = bak.size();
				longpali = sub;
			}
      }
	  }
	  return longpali;
}
int main()
{
    cout << "Longest Palindrome ="<<FindPali("annanya");

}
