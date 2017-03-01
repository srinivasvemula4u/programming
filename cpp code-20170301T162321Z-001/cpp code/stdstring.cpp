#include <string> // for std::string
#include <iostream>

int main()
{
    using namespace std; // for both cout and string
    cout << "Enter your name: ";
    string strString;
    //cin >> strString; // It doesnt read string after whitespace ex:srinivas vemula reads only srinivas
    getline(cin,strString);
    char str[]= "hello";
    char *ptr;
    ptr= str;
    cout<< "Size of Pointer "<< sizeof(ptr) << endl;
    cout << "Size of *ptr =" <<sizeof(*ptr) << endl;
    cout << "Hello, " << strString << "!" << endl;

    cout << "Your name has: " << strString.length() <<
            " characters in it" << endl;
    cout << "The 2nd character is: " << strString[1] << endl;

    strString = "Dave";
    cout << "Your name is now " << strString << endl;
    cout << "Goodbye, " << strString << endl;

    return 0;
}
