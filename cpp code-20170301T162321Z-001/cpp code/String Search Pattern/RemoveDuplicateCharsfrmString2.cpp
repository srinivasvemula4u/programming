#include<iostream>
#include<string>
#include<vector>
#define No_Of_Chars 256
using namespace std;

string DupRemovFrmStrUsngHash(string str)
{
  vector<int> bin_Hash(No_Of_Chars,0);
  int ip_ind =0, res_ind =0;
  string::iterator strItr = str.begin();
  while(strItr != str.end())
  {
      if(bin_Hash[static_cast<int>(str[ip_ind])] == 0)
      {
          //cout<<"entered"<<endl;
          str[res_ind] = str[ip_ind];
          bin_Hash[static_cast<int>(str[ip_ind])] = 1;
          res_ind++;
      }
    strItr++;
    ip_ind++;

  }
  str.erase(str.begin()+res_ind,str.end());
  return str;
}
int main()
{
    string str;
    cout<< "Enter Input string to remove duplicate chars"<<endl;
    cin>>str;
    cout<<DupRemovFrmStrUsngHash(str);
}
