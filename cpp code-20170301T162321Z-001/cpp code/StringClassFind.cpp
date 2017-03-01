#include<iostream>
#include<string>
#include<algorithm>

using namespace std;

int main()
{
    string strSample ("Good day String! Today is beautiful!");
    cout << "The sample string is:"  << endl;
    cout << strSample << endl << endl;
    size_t charPos = strSample.find("day",0);
    if(charPos != string::npos)
    {
        cout << "First instance of \"day\" was found at position"<< charPos;
    }
 else
 cout << "Substring not found." << endl;

  cout << "Printing all instances of day" <<endl;
  size_t SubstringPos = strSample.find ("day", 0);

while (SubstringPos != string::npos)
 {
 cout << "\"day\" found at position " << SubstringPos << endl;

 // Make find search forward from the next character
 size_t nSearchPosition = SubstringPos + 1;

 SubstringPos = strSample.find ("day", nSearchPosition);
 }
size_t SubstringPos1 = strSample.find ('d', 0);
cout<<SubstringPos1;
// Delete characters from the string given position and count
 cout << "Truncating the second sentence: "<< endl;
 strSample.erase (13, 28);
cout << strSample << endl << endl;
string strSam ("Hello String! Wake up to a beautiful day!");
string::iterator iter = find(strSam.begin(),strSam.end(),'S');
if (iter != strSample.end())
strSample.erase(iter);
cout<<strSam<<endl;

}
