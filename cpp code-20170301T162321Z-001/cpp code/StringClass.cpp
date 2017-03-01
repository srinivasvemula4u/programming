#include<iostream>
#include<string>
#include<cstring>

using namespace std;

int main()
{
    const char *mystring = "Hello String";
    cout << "String is=" << mystring <<endl;
    cout<< strlen(mystring) <<endl;
    cout<< sizeof(mystring) <<endl;
    string cmystring(mystring);
    cout<< "String class string ="<<cmystring<<endl;

    std::string str2Copy (cmystring);
      cout<< "String class string ="<<str2Copy<<endl;

    string partialcopy(mystring,5);
    cout<< "Partial String is" << partialcopy <<endl;

    string partialStringCopy(str2Copy,8);
    cout<< "Partial String copy=" <<partialStringCopy; // Copies string after n characters here n =8

    string strRepeatChars (10, 'a');
   cout << "strRepeatChars is: "<< strRepeatChars << endl;

}
