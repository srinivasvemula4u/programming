#include <iostream>
#include <stdexcept>
#include<vector>
using namespace std;
//const std::vector<std::string> first14 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen" };
//const std::vector<std::string> prefixes = {"twen", "thir", "for", "fif", "six", "seven", "eigh", "nine"};
vector<string> first14;

vector<string> prefixes;

std::string inttostr( const unsigned int number )
{
    if( number <= 14 )
        return first14.at(number);
    if( number < 20 )
        return prefixes.at(number-12) + "teen";
    if( number < 100 ) {
       // unsigned int remainder = number - (static_cast<int>(number/10)*10);
        unsigned int remainder = number % 10;
        return prefixes.at(number/10-2) + (0 != remainder ? "ty " + inttostr(remainder) : "ty");
    }
    if( number < 1000 ) {
        //unsigned int remainder = number - (static_cast<int>(number/100)*100);u
        unsigned int remainder = number % 100;
        return first14.at(number/100) + (0 != remainder ? " hundred " + inttostr(remainder) : " hundred");
    }
    if( number < 1000000 ) {
        //unsigned int thousands = static_cast<int>(number/1000);
        //unsigned int remainder = number - (thousands*1000);
        unsigned int remainder = number % 1000;
        //return inttostr(thousands) + (0 != remainder ? " thousand " + inttostr(remainder) : " thousand");
        return inttostr(static_cast<int>(number/1000)) + (0 != remainder ? " thousand " + inttostr(remainder) : " thousand");
    }
    if( number < 1000000000 ) {
       // unsigned int millions = static_cast<int>(number/1000000);
        //unsigned int remainder = number - (millions*1000000);
        unsigned int remainder = number % 1000000;
        return inttostr(static_cast<int>(number/1000000)) + (0 != remainder ? " million " + inttostr(remainder) : " million");
    }
    throw std::out_of_range("inttostr() value too large");
}

int main()
{
    first14.push_back(string("zero"));
   first14.push_back("one");
    first14.push_back("two");
    first14.push_back("three");
    first14.push_back("four");
    first14.push_back("five");
    first14.push_back("six");
    first14.push_back("seven");
    first14.push_back("eight");
    first14.push_back("nine");
    first14.push_back("ten");
    first14.push_back("eleven");
    first14.push_back("twelve");
    first14.push_back("thirteen");
    first14.push_back("fourteen");
     prefixes.push_back("twen");
    prefixes.push_back("thir");
     prefixes.push_back("for");
      prefixes.push_back("fif");
       prefixes.push_back("six");
       prefixes.push_back("seven");
       prefixes.push_back("eigh");
       prefixes.push_back("nine");
    try {
        int num;
        cout<< "Enter a number to print in words" << endl;
        cin >> num;
      //  for( int i = 0; i <= 999999999; i++ )
          std::cout  << inttostr(num) << std::endl;
    } catch( std::exception& ex ) {
        std::cerr << "Error: " << ex.what() << std::endl;
    }
    return 0;
}
