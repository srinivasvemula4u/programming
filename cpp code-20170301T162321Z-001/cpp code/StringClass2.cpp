#include<iostream>
#include<string>

using namespace std;

int main()
{
    string strSTLString ("Hello String");
   // string *string1("Hello"); //can not be defined.
    cout<< sizeof(strSTLString) <<endl;
    cout<< "String Length ="<<strSTLString.length()<<endl;
    for(int i=0; i< strSTLString.length(); i++)
        cout<<strSTLString[i];
    // Access the contents of a string using iterators
    cout << "Displaying the contents of the string using iterators:" <<endl;
    string::const_iterator iter = strSTLString.begin();
    while(iter != strSTLString.end())
    {
        cout<<*iter;
        iter++;

    }
    cout<< "C Style String representation ="<<strSTLString.c_str() <<endl;
    string strSample1 ("Hello");
string strSample2 ("String!");
strSample1 += strSample2; // use std::string::operator+=
cout<<strSample1<<endl;
// alternatively use std::string::append()
strSample1.append (strSample2); // (overloaded for char* too)
cout<<strSample1 <<endl;
}
